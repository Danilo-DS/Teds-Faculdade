package state;

public class LampadaQueimada implements StateLampada{
	
	public LampadaQueimada() {	}

	@Override
	public String estado(Lampada contexto) {
		contexto.setEstado(this);
		return "Lampada Queimada ;-;";
	}

}
