package br.com.fiap.repository;

import br.com.fiap.entity.StartupUsuario;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsuarioStartupRepository extends CrudRepository<StartupUsuario, Integer> {

    @Query(value = "select sc from USUARIO_STARTUP where sc.STARTUP_ID = :id", nativeQuery = true)
    public List<StartupUsuario> findUsersByStartup(@Param("id") String id);
}
