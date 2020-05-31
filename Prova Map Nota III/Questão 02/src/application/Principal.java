package application;

import modelC.Arquivo;
import modelC.PastaComposta;

public class Principal {

	public static void main(String[] args) {
		
		PastaComposta pasta = new PastaComposta("Pasta 01");
		System.out.println("===========Arquivos===========");
		Arquivo a1 = new Arquivo("Teste", 512);
		System.out.println(a1.exibir());
		
		Arquivo a2 = new Arquivo("Teste2", 512);
		System.out.println(a2.exibir());
		
		
		System.out.println("===========Adicionando arquivos============");
		pasta.adicionar(a1);
		pasta.adicionar(a2);
		
		System.out.println("===========Listando Arquivos da Pasta============");
		pasta.listarArquivos(); // listando Arquivos 1 por 1
		
		
		
		System.out.println("===========Excluindo Arquivo Da pasta============");
		System.out.println(pasta.excluir("Teste2"));
		System.out.println(pasta.exibir());
		
		System.out.println("===========Adiconando uma SubPasta============");
		PastaComposta pasta2 = new PastaComposta("Pasta 02");
		pasta2.adicionar(a1);
		pasta2.adicionar(pasta);
		
		System.out.println("===========Exibindo Pasta2============");
		System.out.println(pasta2.exibir());
		
	}

}
