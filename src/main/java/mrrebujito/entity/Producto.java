package mrrebujito.entity;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

@Entity
// @Getter
public class Producto {
	@NotBlank
	private String nombreProducto;

	@Pattern(regexp = "'COMIDA' | 'BEBIDA'")
	private String tipoProducto;

	@Min(0)
	@Digits(fraction = 3, integer = 2)
	private double precioProducto;
}
