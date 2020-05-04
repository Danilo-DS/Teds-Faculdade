package services;

import file.ArquivoPrototype;

public class EditorTexto extends ArquivoPrototype {
	
	protected EditorTexto(ArquivoPrototype ap) {
		this.nomearquivo = ap.getNomearquivo();
		this.path = ap.getPath();
		this.data_hora = ap.dataHora();
		this.proprietario = ap.getProprietario();
		this.email = ap.getEmail();
		this.autorizacaoImp = getAutorizacaoimp();
		this.autorizacaoCopia = getAutorizacaoimp();
		this.conteudo = getConteudo();
	}
	
	public EditorTexto() {}
	
	@Override
	public String FileInfo() {

		return (">> Nome do Arquivo: " + getNomearquivo() +" Diret�rio: " + getPath() + getNomearquivo()+".txt"+ 
				"\n>> Data e Hora: " + dataHora() +" Propriet�rio: " + getProprietario() +"\n>> Email: " + getEmail() + 
				"\n>> Autoriza��o para Impress�o: " + getAutorizacaoimp() +	"\n>> Autoriza��o para Copia: " + getAutorizacaocopia());
	}

	@Override
	public String AbrirArquivo() {
		
		return (">> Iniciando Abertura\n"
				+LocalizaArquivo() 
				+"\n>> Abrindo Arquivo"
				+"\n>> Informa��s do arquivo:" + getNomearquivo()+".txt"
				+" - Propriet�rio: " + getProprietario()
				+ "\n Conte�do: Esse � um arquivo teste do tipo .txt"
				+ "\n>> Arquivo Aberto");
	}

	public String SalvaArquivo() {
		return (">> Iniciando Salvamento\n"
				+">> Salvando Arquivo em "+ getPath() + "/" + getNomearquivo()+".txt\n"
				+">> Arquivo Salvo");
	}

	@Override
	public String GerarArquivo() {
		// TODO Auto-generated method stub
		return (">> Gerando Arquivo de Texto\n"+ FileInfo() + "\n"
				+ "\n>> " + getConteudo()
				+ "\n>> Arquivo Gerado\n"
				+ SalvaArquivo());
	}


	@Override
	public String LocalizaArquivo() {
		
		return 	(">> Localizando Arquivo\n"+
				">> Arquivo Localizado\n"+
				">> Path: "+ getPath() + "/" + getNomearquivo() + ".txt");
	}

	@Override
	public ArquivoPrototype Clonar() {
		return new EditorTexto(this);
	}

	@Override
	public String Imprimir() {
		// TODO Auto-generated method stub
		return ">> Iniciando Processo de Impress�o"
				+"\n>> Conectando-se a Impressora"
				+"\n>> Iniciando Impress�o do Arquivo" + getNomearquivo() + ".txt"
				+"\n>> Impress�o Concluida"
				+"\n>> Processo de Impress�o Encerrado";
	}

	@Override
	public String Copiar() {
		// TODO Auto-generated method stub
		return ">> Iniciando Processo de Copia"
				+"\n>> Inicaindo Copia de Arquivo" + getNomearquivo() + ".txt"
				+"\n>> Copia Concluida"
				+"\n>> Processo de Copia Encerrado";
	}
		
	
}	
