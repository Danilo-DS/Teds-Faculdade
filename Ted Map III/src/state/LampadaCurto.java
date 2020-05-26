package state;

public class LampadaCurto implements StateLampada{
	
	public LampadaCurto() {	}

	@Override
	public String estado(Lampada contexto) {
		contexto.setEstado(this);
		return "Lampada em Curto, Troque-a !";
	}

}
