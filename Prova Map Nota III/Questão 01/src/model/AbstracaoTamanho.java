package model;

public abstract class AbstracaoTamanho {
	
	protected ImplementacaoRefrigerante refri;
	
	public AbstracaoTamanho(ImplementacaoRefrigerante refri) {
		this.refri = refri;
	}
	
	public abstract void beber();
}
