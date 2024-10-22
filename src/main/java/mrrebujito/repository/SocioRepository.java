package mrrebujito.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mrrebujito.entity.Socio;

@Repository
public interface SocioRepository extends JpaRepository<Socio, Integer>{
}
