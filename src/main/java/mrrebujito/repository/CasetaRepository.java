package mrrebujito.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mrrebujito.entity.Caseta;

@Repository
public interface CasetaRepository extends JpaRepository<Caseta, Integer> {
}
