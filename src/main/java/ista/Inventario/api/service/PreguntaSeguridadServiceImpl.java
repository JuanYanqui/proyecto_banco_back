package ista.Inventario.api.service;

import ista.Inventario.api.model.FotoUsuario;
import ista.Inventario.api.model.PreguntaSeguridad;
import ista.Inventario.api.payload.PreguntaFilter;
import ista.Inventario.api.payload.RespuestaFilter;
import ista.Inventario.api.repository.FotoUsuarioRepository;
import ista.Inventario.api.repository.PreguntaSeguridadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PreguntaSeguridadServiceImpl extends GenericServiceImpl<PreguntaSeguridad, Long> implements PreguntaSeguridadService{
    @Autowired
    PreguntaSeguridadRepository preguntaSeguridadRepository;


    @Override
    public CrudRepository<PreguntaSeguridad, Long> getDao() {
        return null;
    }

    @Override
    public PreguntaFilter obtenerPreguntaSeguridad(Long idUsuario) {
        return preguntaSeguridadRepository.obtenerPreguntaAleatoriaPorUsuario(idUsuario);
    }

    @Override
    public RespuestaFilter verificarRespuestas(Long idFoto, Long idPregunta, String respuesta) {
        return preguntaSeguridadRepository.verificarRespuestas(idFoto,idPregunta,respuesta);
    }
}