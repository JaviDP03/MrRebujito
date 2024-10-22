package mrrebujito.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mrrebujito.entity.Ayuntamiento;

@Repository
public interface AyuntamientoRepository extends JpaRepository<Ayuntamiento, Integer> {
}
