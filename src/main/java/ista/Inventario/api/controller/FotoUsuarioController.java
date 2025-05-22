package ista.Inventario.api.controller;

import ista.Inventario.api.model.FotoUsuario;
import ista.Inventario.api.model.Rol;
import ista.Inventario.api.service.FotoUsuarioService;
import ista.Inventario.api.service.RolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping("/fotoUsuario")
@CrossOrigin(origins = ("http://localhost:5000"))
public class FotoUsuarioController {
    @Autowired
    private FotoUsuarioService fotoUsuarioService;

    @RequestMapping(value = "/{idUsuario}", method = RequestMethod.GET)
    @ResponseBody
    @CrossOrigin
    public List<FotoUsuario> obtenerFotosU(@PathVariable Long idUsuario){
        return fotoUsuarioService.obtenerFotosUsua(idUsuario);
    }
}