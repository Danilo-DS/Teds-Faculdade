package services;

import file.ArquivoPrototype;

public class EditorPlanilha extends ArquivoPrototype {
	
	protected EditorPlanilha(ArquivoPrototype ap) {
		this.nomearquivo = ap.getNomearquivo();
		this.path = ap.getPath();
		this.data_hora = ap.dataHora();
		this.proprietario = ap.getProprietario();
		this.email = ap.getEmail();
		this.autorizacaoImp = getAutorizacaoimp();
		this.autorizacaoCopia = getAutorizacaoimp();
		this.conteudo = getConteudo();
	}
	
	public EditorPlanilha() {}
	
	@Override
	public String FileInfo() {
		// TODO Auto-generated method stub
		return (">> Nome do Arquivo: " + getNomearquivo() +" Diretório: " + getPath() + getNomearquivo()+".xlsx"+ 
				"\n>> Data e Hora: " + dataHora() +" Proprietário: " + getProprietario() +"\n>> Email: " + getEmail() + 
				"\n>> Autorização para Impressão: " + getAutorizacaoimp() +	"\n>> Autorização para Copia: " + getAutorizacaocopia());
	}

	@Override
	public String AbrirArquivo() {
		
		return (">> Iniciando Abertura\n"
				+LocalizaArquivo() 
				+"\n>> Abrindo Arquivo"
				+"\n>> Informaçõs do arquivo:" + getNomearquivo()+".xlsx"
				+" - Proprietário: " + getProprietario()
				+ "\n Conteúdo: Esse é um arquivo teste do tipo .xlsx"
				+ "\n>> Arquivo Aberto");
	}

	public String SalvaArquivo() {
		return (">> Iniciando Salvamento\n"
				+">> Salvando Arquivo em "+ getPath() + "/" + getNomearquivo()+".xlsx\n"
				+">> Arquivo Salvo");
	}

	@Override
	public String GerarArquivo() {
		// TODO Auto-generated method stub
		return (">> Gerando Arquivo de Planilha\n"+ FileInfo() + "\n"
				+ "\n>> " + getConteudo()
				+ "\n>> Arquivo Gerado\n"
				+ SalvaArquivo());
	}


	@Override
	public String LocalizaArquivo() {
		
		return (">> Localizando Arquivo\n"+
				">> Arquivo Localizado\n"+
				">> Path: "+ getPath() + "/" + getNomearquivo() + ".xlsx");
	}

	@Override
	public ArquivoPrototype Clonar() {
		return new EditorPlanilha(this);
	}

	@Override
	public String Imprimir() {
		return ">> Iniciando Processo de Impressão"
				+"\n>> Conectando-se a Impressora"
				+"\n>> Iniciando Impressão do Arquivo " + getNomearquivo() + ".xlsx"
				+"\n>> Impressão Concluida"
				+"\n>> Processo de Impressão Encerrado";
	}

	@Override
	public String Copiar() {
		return ">> Iniciando Processo de Copia"
				+"\n>> Inicaindo Copia de Arquivo" + getNomearquivo() + ".xlsx"
				+"\n>> Copia Concluida"
				+"\n>> Processo de Copia Encerrado";
	}


	
}
