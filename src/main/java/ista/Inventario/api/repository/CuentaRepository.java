package ista.Inventario.api.repository;

import ista.Inventario.api.model.Cuenta;
import ista.Inventario.api.model.FotoUsuario;
import ista.Inventario.api.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CuentaRepository extends JpaRepository<Cuenta, Long> {
    @Query("SELECT r FROM Cuenta r WHERE r.usuario.idUsuario = :idUsuario")
    List<Cuenta> getByUsuId(@Param("idUsuario") Long idUsuario);

}
