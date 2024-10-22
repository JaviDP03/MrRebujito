package mrrebujito.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mrrebujito.entity.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Integer> {
}
