package mrrebujito.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.Min;

@Entity
public class Ayuntamiento extends Actor {
	@Min(0)
	private int numLicencias;

	private List<Solicitud> solicitudes;

	public Ayuntamiento() {
		super();
	}

	public int getNumLicencias() {
		return numLicencias;
	}

	public void setNumLicencias(int numLicencias) {
		this.numLicencias = numLicencias;
	}

	@OneToMany
	public List<Solicitud> getSolicitudes() {
		return solicitudes;
	}

	public void setSolicitudes(List<Solicitud> solicitudes) {
		this.solicitudes = solicitudes;
	}

}
