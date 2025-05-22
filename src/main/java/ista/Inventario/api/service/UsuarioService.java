package ista.Inventario.api.service;


import ista.Inventario.api.model.Usuario;

import java.util.Optional;

public interface UsuarioService extends GenericService <Usuario, Long>{
    Usuario login (String username, String password);

    boolean porUsername(String username);


    Optional<Usuario> porId(Long idUsuario);

    Usuario porUsernameData(String username);
}
