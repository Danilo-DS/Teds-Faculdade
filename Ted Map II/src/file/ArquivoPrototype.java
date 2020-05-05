package file;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

//Class Prototyp, contem todas as caracteristica de um arquivo
public abstract class ArquivoPrototype {
	protected String nomearquivo;
	protected String path;
	protected String data_hora;
	protected String proprietario;
	protected String email;
	protected String autorizacaoImp;
	protected String autorizacaoCopia;
	protected String conteudo;
	
	public ArquivoPrototype() {}

	public String getNomearquivo() {
		return nomearquivo;
	}

	public void setNomearquivo(String nomearquivo) {
		this.nomearquivo = nomearquivo;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}
	
	public String getProprietario() {
		return proprietario;
	}

	public void setProprietario(String proprietario) {
		this.proprietario = proprietario;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAutorizacaoimp() {
		return autorizacaoImp;
	}

	public void setAutorizacaoimp(String autorizacaoimp) {
		this.autorizacaoImp = autorizacaoimp;
	}

	public String getAutorizacaocopia() {
		return autorizacaoCopia;
	}

	public void setAutorizacaocopia(String autorizacaocopia) {
		this.autorizacaoCopia = autorizacaocopia;
	}
		
	public String getConteudo() {
		return conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}
	
	
	public String dataHora() {
		DateFormat dataFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		Date now = new Date();
		return dataFormat.format(now);
	}
	
	
	public abstract String LocalizaArquivo();
	
	public abstract String FileInfo();
	
	public abstract String AbrirArquivo();
	
	public abstract String GerarArquivo();
	
	public abstract String Imprimir();
	
	public abstract String Copiar();
	
	public abstract String SalvaArquivo();
	
	public abstract ArquivoPrototype Clonar();
}
