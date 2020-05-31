package model;

public class TamanhoMedio extends AbstracaoTamanho{

	public TamanhoMedio(ImplementacaoRefrigerante refri) {
		super(refri);
		// TODO Auto-generated constructor stub
	}
	
	public void beber() {
		System.out.println("Regrigerante Médio");
		System.out.println("Tomou um gole de " + refri.refrigerante());
		System.out.println("Tomou um gole de " + refri.refrigerante());
		System.out.println("Acabou o(a) "+ refri.refrigerante());
	}
	
}
