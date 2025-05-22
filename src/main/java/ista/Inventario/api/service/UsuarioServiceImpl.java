package ista.Inventario.api.service;

import ista.Inventario.api.model.Usuario;
import ista.Inventario.api.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UsuarioServiceImpl extends GenericServiceImpl<Usuario, Long> implements UsuarioService{
    @Autowired
    UsuarioRepository usuarioRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;
    @Override
    public CrudRepository<Usuario, Long> getDao() {
        return usuarioRepository;
    }

    @Override
    public Usuario login(String username, String password) {

        return usuarioRepository.findByUserAndPassword(username, password);
    }


    public boolean porUsername(String username) {
        if (usuarioRepository.findByUsername(username)!=null) {
            return true;
        }else {
            return false;
        }

    }

    public Usuario porUsernameData(String username) {
       return usuarioRepository.findByUsername(username);
    }

    @Override
    public Optional<Usuario> porId(Long idUsuario) {

        return usuarioRepository.findById(idUsuario);
    }
    public boolean checkPassword(String rawPassword, String encodedPassword) {
        return passwordEncoder.matches(rawPassword, encodedPassword);
    }
}
