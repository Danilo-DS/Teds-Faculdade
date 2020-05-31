package model;

public class TamanhoPequeno extends AbstracaoTamanho{

	public TamanhoPequeno(ImplementacaoRefrigerante refri) {
		super(refri);
		// TODO Auto-generated constructor stub
	}
	
	public void beber() {
		System.out.println("Regrigerante Pequeno");
		System.out.println("Tomou um gole de " + refri.refrigerante());
		System.out.println("Acabou o(a) "+ refri.refrigerante());
	}
}
