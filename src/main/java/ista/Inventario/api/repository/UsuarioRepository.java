package ista.Inventario.api.repository;

import ista.Inventario.api.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    @Query("SELECT r FROM Usuario r WHERE r.username = :username AND r.password = :password")
    Usuario findByUserAndPassword(@Param("username") String username, @Param("password") String password);

    Usuario findByUsername(String username);


}
