package ista.Inventario.api.repository;

import ista.Inventario.api.model.FotoUsuario;
import ista.Inventario.api.model.Rol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface FotoUsuarioRepository extends JpaRepository<FotoUsuario, Long> {

    @Query(value = "SELECT * FROM (" +
            "  (SELECT * FROM foto_usuario " +
            "   WHERE es_respuesta_correcta = 1 AND id_usuario = :idUsuario " +
            "   LIMIT 1) " +
            "  UNION ALL " +
            "  (SELECT * FROM foto_usuario " +
            "   WHERE es_respuesta_correcta = 0 AND id_usuario = :idUsuario " +
            "   ORDER BY RAND() LIMIT 7)" +
            ") AS fotos " +
            "ORDER BY RAND()",
            nativeQuery = true)
    List<FotoUsuario> obtenerFotosPorUsuarioConUnaCorrecta(@Param("idUsuario") Long idUsuario);

}
