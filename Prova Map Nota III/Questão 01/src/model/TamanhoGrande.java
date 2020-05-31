package model;

public class TamanhoGrande extends AbstracaoTamanho{

	public TamanhoGrande(ImplementacaoRefrigerante refri) {
		super(refri);
	}

	public void beber() {
		System.out.println("Regrigerante Grande");
		System.out.println("Tomou um gole de " + refri.refrigerante());
		System.out.println("Tomou um gole de " + refri.refrigerante());
		System.out.println("Tomou um gole de " + refri.refrigerante());
		System.out.println("Tomou um gole de " + refri.refrigerante());
		System.out.println("Acabou o(a) "+ refri.refrigerante());
	}

}
