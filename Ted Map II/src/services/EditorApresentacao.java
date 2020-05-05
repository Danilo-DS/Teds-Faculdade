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
		return (">> Nome do Arquivo: " + getNomearquivo() +" Diretório: " + getPath() + getNomearquivo()+".pptx"+ 
				"\n>> Data e Hora: " + dataHora() +" Proprietário: " + getProprietario() +"\n>> Email: " + getEmail() + 
				"\n>> Autorização para Impressão: " + getAutorizacaoimp() +	"\n>> Autorização para Copia: " + getAutorizacaocopia());
	}


	@Override
	public String AbrirArquivo() {
		
		return (">> Iniciando Abertura\n"
				+LocalizaArquivo() 
				+"\n>> Abrindo Arquivo"
				+"\n>> Informaçõs do arquivo:" + getNomearquivo()+".pptx"
				+" - Proprietário: " + getProprietario()
				+ "\n Conteúdo: Esse é um arquivo teste do tipo .pptx"
				+ "\n>> Arquivo Aberto");
	}

	public String SalvaArquivo() {
		return (">> Iniciando Salvamento\n"
				+">> Salvando Arquivo em "+ getPath() + "/" + getNomearquivo()+".pptx\n"
				+">> Arquivo Salvo");
	}

	@Override
	public String GerarArquivo() {
		return (">> Gerando Arquivo de Apresentação\n"+ FileInfo() + "\n"
				+ "\n>>Conteúdo: " + getConteudo()
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
		return ">> Iniciando Processo de Impressão"
				+"\n>> Conectando-se a Impressora"
				+"\n>> Iniciando Impressão do Arquivo " + getNomearquivo() + ".pptx"
				+"\n>> Impressão Concluida"
				+"\n>> Processo de Impressão Encerrado";
	}

	@Override
	public String Copiar() {
		return ">> Iniciando Processo de Copia"
				+"\n>> Inicaindo Copia de Arquivo" + getNomearquivo() + ".pptx"
				+"\n>> Copia Concluida"
				+"\n>> Processo de Copia Encerrado";
	}

	
	
	
}
