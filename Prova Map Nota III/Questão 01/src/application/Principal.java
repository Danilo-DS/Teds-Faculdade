package application;

import model.AbstracaoTamanho;
import model.CocaCola;
import model.Fanta;
import model.Guarana;
import model.Sprite;
import model.TamanhoFamilia;
import model.TamanhoGrande;
import model.TamanhoMedio;
import model.TamanhoPequeno;

public class Principal {

	public static void main(String[] args) {
		
		AbstracaoTamanho  at1 = new TamanhoPequeno(new Fanta());
		at1.beber();
		
		AbstracaoTamanho  at2 = new TamanhoMedio(new CocaCola());
		at2.beber();
		
		AbstracaoTamanho  at3 = new TamanhoGrande(new Guarana());
		at3.beber();
		
		AbstracaoTamanho  at4 = new TamanhoFamilia(new Sprite());
		at4.beber();
		
	}

}
