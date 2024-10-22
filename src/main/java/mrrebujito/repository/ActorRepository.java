package mrrebujito.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mrrebujito.entity.Actor;

@Repository
public interface ActorRepository extends JpaRepository<Actor, Integer> {
}
