package gerencia;

import file.ArquivoPrototype;
import services.EditorApresentacao;
import services.EditorPlanilha;
import services.EditorTexto;

public class FactorySuite {
	
	//Factory method gerencia quem está sendo solicitado pelas View
	
	public FactorySuite () {}
	
	public ArquivoPrototype getFile(String arq, String FileP,String FileN,
			String FilePpt, String FileE, String FileAI, String FileAC, String FileC) {
		
		if(arq.equalsIgnoreCase("apresentação")) {
			
			EditorApresentacao ea = new EditorApresentacao();
			
			ea.setNomearquivo(FileN);
			ea.setPath(FileP);
			ea.setProprietario(FilePpt);
			ea.setEmail(FileE);
			ea.setAutorizacaoimp(FileAI);
			ea.setAutorizacaocopia(FileAC);
			ea.setConteudo(FileC);
						
			return ea;
		}
		else if(arq.equalsIgnoreCase("texto")) {
			
			EditorTexto et = new EditorTexto();
			et.setNomearquivo(FileN);
			et.setPath(FileP);
			et.setProprietario(FilePpt);
			et.setEmail(FileE);
			et.setAutorizacaoimp(FileAI);
			et.setAutorizacaocopia(FileAC);
			et.setConteudo(FileC);
			
			return et;
		}
		
		else if (arq.equalsIgnoreCase("planilha")) {
			
			EditorPlanilha ep = new EditorPlanilha();
			ep.setNomearquivo(FileN);
			ep.setPath(FileP);
			ep.setProprietario(FilePpt);
			ep.setEmail(FileE);
			ep.setAutorizacaoimp(FileAI);
			ep.setAutorizacaocopia(FileAC);
			ep.setConteudo(FileC);
			
			return ep;
		}
	
		else {
			return null ;
		}
	}
}
