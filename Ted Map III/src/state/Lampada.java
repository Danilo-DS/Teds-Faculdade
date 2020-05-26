package state;

public class Lampada {
	
	private StateLampada estado;

	public Lampada() {
		estado = null;
	}
	
	public StateLampada getEstado() {
		return estado;
	}

	public void setEstado(StateLampada estado) {
		this.estado = estado;
	}
	
}
