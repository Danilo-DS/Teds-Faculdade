package state;

public class LampadaLigada implements StateLampada{

	public LampadaLigada() {}

	@Override
	public String estado(Lampada contexto) {
		contexto.setEstado(this);
		return "Lampada Ligada :)";
	}

}
