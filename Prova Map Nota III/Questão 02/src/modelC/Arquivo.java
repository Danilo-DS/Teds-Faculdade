package modelC;

public class Arquivo extends File {

	public Arquivo(String nome, int tamanho) {
		this.nome = nome;
		this.tamanho = tamanho;
	}
	
	@Override
	public String exibir() {
		super.exibir();
		return "Nome do Arquivo: " + nome + " Tamanho: " + tamanho(tamanho);
	}
	
	@Override
	public String tamanho(int t) {
		
		if(t > 1024) {
			return (t +"MB");
		}
		else {
			return (t +"KB");
		}
	}
	
}
