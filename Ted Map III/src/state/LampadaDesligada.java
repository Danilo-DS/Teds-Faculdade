package state;

public class LampadaDesligada implements StateLampada{
	
	public LampadaDesligada() {}

	@Override
	public String estado(Lampada contexto) {
		contexto.setEstado(new LampadaDesligada());
		return "Lampada Desligada :(";	
	}

}
