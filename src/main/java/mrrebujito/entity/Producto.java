package mrrebujito.entity;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Producto {
	@NotBlank
	private String nombreProducto;

	@Pattern(regexp = "'COMIDA' | 'BEBIDA'")
	private String tipoProducto;

	@Min(0)
	private double precioProducto;

	public Producto() {
		super();
	}

}
