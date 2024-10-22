package mrrebujito.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Caseta extends Actor {
	@NotBlank
	private String razonSocial;

	@Min(0)
	private int aforo;

	private boolean esPublico;

	private List<Producto> carta;

	private List<Solicitud> solicitudes;

	public Caseta() {
		super();
	}

	public String getRazonSocial() {
		return razonSocial;
	}

	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}

	public int getAforo() {
		return aforo;
	}

	public void setAforo(int aforo) {
		this.aforo = aforo;
	}

	public boolean isEsPublico() {
		return esPublico;
	}

	public void setEsPublico(boolean esPublico) {
		this.esPublico = esPublico;
	}

	@ManyToMany
	public List<Producto> getCarta() {
		return carta;
	}

	public void setCarta(List<Producto> carta) {
		this.carta = carta;
	}

	@OneToMany
	public List<Solicitud> getSolicitudes() {
		return solicitudes;
	}

	public void setSolicitudes(List<Solicitud> solicitudes) {
		this.solicitudes = solicitudes;
	}
}
