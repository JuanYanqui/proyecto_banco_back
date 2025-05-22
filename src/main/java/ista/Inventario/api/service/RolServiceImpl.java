package ista.Inventario.api.service;

import ista.Inventario.api.model.Rol;
import ista.Inventario.api.repository.RolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class RolServiceImpl extends GenericServiceImpl<Rol, Long> implements RolService{
    @Autowired
    RolRepository rolRepository;

    @Override
    public CrudRepository<Rol, Long> getDao() {
        return rolRepository;
    }

    @Override
    public Optional<Rol> porId(Long idRol) {

        return rolRepository.findById(idRol);
    }

    @Override
    public Rol porNombre(String nombre) {

        return rolRepository.findByNombre(nombre);
    }
}
