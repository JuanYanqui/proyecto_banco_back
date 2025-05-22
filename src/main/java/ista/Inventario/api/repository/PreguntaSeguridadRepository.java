package ista.Inventario.api.repository;
import ista.Inventario.api.model.FotoUsuario;
import ista.Inventario.api.model.PreguntaSeguridad;
import ista.Inventario.api.payload.PreguntaFilter;
import ista.Inventario.api.payload.RespuestaFilter;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PreguntaSeguridadRepository extends JpaRepository<FotoUsuario, Long> {

    @Query(value = "SELECT r.id_pregunta as idPregunta,r.pregunta as nombrePregunta FROM pregunta_seguridad r INNER JOIN usuario_pregunta usu ON r.id_pregunta = usu.id_usuario_pregunta WHERE usu.id_usuario = :idUsuario ORDER BY RAND() LIMIT 1", nativeQuery = true)
    public PreguntaFilter obtenerPreguntaAleatoriaPorUsuario(Long idUsuario);

    @Query(value = "SELECT fot.id_foto as idFoto,pre.id_pregunta as idPregunta,pre.respuesta as nombreRespuesta \n" +
            "FROM foto_usuario fot  \n" +
            "inner join usuario_pregunta pre \n" +
            "on (fot.id_usuario=pre.id_usuario and fot.es_respuesta_correcta =1) where fot.id_foto = :idFoto and pre.id_pregunta= :idPregunta and pre.respuesta= :respuesta ", nativeQuery = true)
    public RespuestaFilter verificarRespuestas(Long idFoto, Long idPregunta, String respuesta);
}
