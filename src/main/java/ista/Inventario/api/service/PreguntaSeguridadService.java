package ista.Inventario.api.service;

import ista.Inventario.api.model.FotoUsuario;
import ista.Inventario.api.model.PreguntaSeguridad;
import ista.Inventario.api.payload.PreguntaFilter;
import ista.Inventario.api.payload.RespuestaFilter;

import java.util.List;

public interface PreguntaSeguridadService extends GenericService<PreguntaSeguridad, Long> {

    PreguntaFilter obtenerPreguntaSeguridad(Long idUsuario);

    RespuestaFilter verificarRespuestas(Long idFoto,Long idPregunta,String respuesta);
}