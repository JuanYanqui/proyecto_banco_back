package ista.Inventario.api.controller;

import ista.Inventario.api.AuthResponse;
import ista.Inventario.api.JwtUtil;
import ista.Inventario.api.model.LoginRequest;
import ista.Inventario.api.service.UsuarioServiceImpl;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import ista.Inventario.api.model.Usuario;
import ista.Inventario.api.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/usuario")
@CrossOrigin(origins = ("http://localhost:5000"))
public class UsuarioController {
    @Autowired
    private UsuarioService service;

    @Autowired
    private UsuarioServiceImpl usuarioService;
    @Autowired
    private JwtUtil jwtUtil;

    @RequestMapping(value = "/{idUsuario}", method = RequestMethod.GET)
    @ResponseBody
    @CrossOrigin
    public Optional<Usuario> porId(@PathVariable Long idUsuario) {
        return service.porId(idUsuario);
    }

    @GetMapping("/li")
    public ResponseEntity<List<Usuario>> obtenerListali() {
        return new ResponseEntity<>(service.findByAll(), HttpStatus.OK);
    }

    @PostMapping("/cre")
    public ResponseEntity<Usuario> crearcli(@RequestBody Usuario usuario) {
        return new ResponseEntity<>(service.save(usuario), HttpStatus.CREATED);
    }

    @PutMapping("/upd/{id}")
    public ResponseEntity<Usuario> UpdateUser(@RequestBody Usuario u, @PathVariable Long id) {
        Usuario us = service.findById(id);
        us.setUsername(u.getUsername());
        us.setPassword(u.getPassword());
        us.setEstado(u.getEstado());
        return new ResponseEntity<>(service.save(us), HttpStatus.CREATED);

    }


    @DeleteMapping("/eli/{id}")
    public ResponseEntity<?> eliminarli(@PathVariable Long id) {
        service.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    @CrossOrigin
    public ResponseEntity<AuthResponse> login(@RequestBody LoginRequest request) {
        String username = request.getUsername();
        String password = request.getPassword();

        Usuario usuario = service.porUsernameData(username);
        if (usuario != null) {
            BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

            if (passwordEncoder.matches(password, usuario.getPassword())) {
                String token = jwtUtil.generateToken(username);
                return ResponseEntity.ok(new AuthResponse(token, usuario));
            } else {
                return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
            }
        } else {
            return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
        }
    }

    @RequestMapping(value = "porUsername/{username}", method = RequestMethod.GET)
    @ResponseBody
    @CrossOrigin
    public boolean porUsername(@PathVariable String username) {
        return service.porUsername(username);
    }


}
