package ista.Inventario.api.service;

import ista.Inventario.api.model.FotoUsuario;
import ista.Inventario.api.model.Usuario;

import java.util.List;
import java.util.Optional;

public interface FotoUsuarioService extends GenericService <FotoUsuario, Long>{

    List<FotoUsuario> obtenerFotosUsua(Long usuario);

}