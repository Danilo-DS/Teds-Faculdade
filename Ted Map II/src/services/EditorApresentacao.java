package services;


import file.ArquivoPrototype;

public class EditorApresentacao extends ArquivoPrototype{
	
	protected EditorApresentacao(ArquivoPrototype ap) {
		this.nomearquivo = ap.getNomearquivo();
		this.path = ap.getPath();
		this.data_hora = ap.dataHora();
		this.proprietario = ap.getProprietario();
		this.email = ap.getEmail();
		this.autorizacaoImp = getAutorizacaoimp();
		this.autorizacaoCopia = getAutorizacaoimp();
		this.conteudo = getConteudo();
	}
	
	public EditorApresentacao() {}

	
	@Override
	public String FileInfo() {
		return (">> Nome do Arquivo: " + getNomearquivo() +" Diret�rio: " + getPath() + getNomearquivo()+".pptx"+ 
				"\n>> Data e Hora: " + dataHora() +" Propriet�rio: " + getProprietario() +"\n>> Email: " + getEmail() + 
				"\n>> Autoriza��o para Impress�o: " + getAutorizacaoimp() +	"\n>> Autoriza��o para Copia: " + getAutorizacaocopia());
	}


	@Override
	public String AbrirArquivo() {
		
		return (">> Iniciando Abertura\n"
				+LocalizaArquivo() 
				+"\n>> Abrindo Arquivo"
				+"\n>> Informa��s do arquivo:" + getNomearquivo()+".pptx"
				+" - Propriet�rio: " + getProprietario()
				+ "\n Conte�do: Esse � um arquivo teste do tipo .pptx"
				+ "\n>> Arquivo Aberto");
	}

	public String SalvaArquivo() {
		return (">> Iniciando Salvamento\n"
				+">> Salvando Arquivo em "+ getPath() + "/" + getNomearquivo()+".pptx\n"
				+">> Arquivo Salvo");
	}

	@Override
	public String GerarArquivo() {
		return (">> Gerando Arquivo de Apresenta��o\n"+ FileInfo() + "\n"
				+ "\n>>Conte�do: " + getConteudo()
				+ "\n>> Arquivo Gerado\n"
				+ SalvaArquivo());
	}


	@Override
	public String LocalizaArquivo() {
		
		return 	(">> Localizando Arquivo\n"+
				">> Arquivo Localizado\n"+
				">> Path: "+ getPath() + "/" + getNomearquivo() + ".pptx");
	}


	@Override
	public ArquivoPrototype Clonar() {
		return new EditorApresentacao(this);
	}

	@Override
	public String Imprimir() {
		return ">> Iniciando Processo de Impress�o"
				+"\n>> Conectando-se a Impressora"
				+"\n>> Iniciando Impress�o do Arquivo " + getNomearquivo() + ".pptx"
				+"\n>> Impress�o Concluida"
				+"\n>> Processo de Impress�o Encerrado";
	}

	@Override
	public String Copiar() {
		return ">> Iniciando Processo de Copia"
				+"\n>> Inicaindo Copia de Arquivo" + getNomearquivo() + ".pptx"
				+"\n>> Copia Concluida"
				+"\n>> Processo de Copia Encerrado";
	}

	
	
	
}
