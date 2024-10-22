package mrrebujito.entity;

import jakarta.persistence.Entity;

@Entity
public class Solicitud extends DomainEntity {
	private TipoEstado tipoEstado;

	public Solicitud() {
		super();
	}

	public TipoEstado getTipoEstado() {
		return tipoEstado;
	}

	public void setTipoEstado(TipoEstado tipoEstado) {
		this.tipoEstado = tipoEstado;
	}
}
