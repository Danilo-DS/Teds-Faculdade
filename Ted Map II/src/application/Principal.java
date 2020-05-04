package application;


import javax.swing.JFrame;

import file.ArquivoPrototype;
import gerencia.FactorySuite;
import interfaceGrafica.View;
import services.EditorTexto;

public class Principal {
	
	public static void main(String[] args) {
		
		//FactorySuite fs = new FactorySuite();
		//EditorTexto et = new EditorTexto();
		//try {
		//ConfigArq ca = fs.getFile("planilha", "teste 01", "Test 01", "24/07/2019", "12:00", "Danilo", "danilo@gmail.com", "sim", "Não");
		//	ArquivoPrototype ca = fs.getFile("Texto", "teste 01", "Test 01", /* "24/07/2019", "12:00", */ "Danilo", "danilo@gmail.com", "sim", "Não");
		//	ArquivoPrototype ca2 = et.Clonar();
		//	ca2.setNomearquivo(ca.getNomearquivo());
		//	ca2.setPath(ca.getPath());
		//	ca2.setProprietario(ca.getProprietario());
		//	ca2.setEmail(ca.getEmail());
		//	ca2.setAutorizacaoimp(ca.getAutorizacaoimp());
		//	ca2.setAutorizacaocopia(ca.getAutorizacaocopia());
		
		//System.out.println(ca.GerarArquivo());
		//System.out.println("");
		//System.out.println(ca2.GerarArquivo()); 
		
		//}
		//catch (NullPointerException e) {
		//	System.out.println("Tipo de arquivo não selecionado!");
		//}
		View v = new View();
		v.Run();
	}
}
