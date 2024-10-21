package mrrebujito.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mrrebujito.entity.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long> {

}
