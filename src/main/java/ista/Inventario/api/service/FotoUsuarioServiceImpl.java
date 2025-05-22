package ista.Inventario.api.service;

import ista.Inventario.api.model.FotoUsuario;
import ista.Inventario.api.model.Usuario;
import ista.Inventario.api.repository.FotoUsuarioRepository;
import ista.Inventario.api.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FotoUsuarioServiceImpl extends GenericServiceImpl<FotoUsuario, Long> implements FotoUsuarioService{
    @Autowired
    FotoUsuarioRepository fotoUsuarioRepository;


    @Override
    public List<FotoUsuario> obtenerFotosUsua(Long usuario) {
        return fotoUsuarioRepository.obtenerFotosPorUsuarioConUnaCorrecta(usuario);
    }

    @Override
    public CrudRepository<FotoUsuario, Long> getDao() {
        return null;
    }
}
