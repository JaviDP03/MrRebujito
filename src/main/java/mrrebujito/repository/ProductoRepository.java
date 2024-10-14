package mrrebujito.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import mrrebujito.entity.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long> {

}
