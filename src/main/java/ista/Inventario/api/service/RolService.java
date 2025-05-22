package ista.Inventario.api.service;


import ista.Inventario.api.model.Rol;

import java.util.Optional;

public interface RolService extends GenericService <Rol, Long>{
    Rol porNombre(String nombre);
    Optional<Rol> porId(Long idRol);
}
