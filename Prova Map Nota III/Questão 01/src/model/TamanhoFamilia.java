package model;

public class TamanhoFamilia extends AbstracaoTamanho{

	public TamanhoFamilia(ImplementacaoRefrigerante refri) {
		super(refri);
	}

	public void beber() {
		System.out.println("Regrigerante Tamanho Familia");
		System.out.println("Tomou um gole de " + refri.refrigerante());
		System.out.println("Tomou um gole de " + refri.refrigerante());
		System.out.println("Tomou um gole de " + refri.refrigerante());
		System.out.println("Tomou um gole de " + refri.refrigerante());
		System.out.println("Tomou um gole de " + refri.refrigerante());
		System.out.println("Tomou um gole de " + refri.refrigerante());
		System.out.println("Acabou o(a) "+ refri.refrigerante());
	}
	
	
}
