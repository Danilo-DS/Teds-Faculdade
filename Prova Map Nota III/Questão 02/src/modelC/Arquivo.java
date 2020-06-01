package modelC;

public class Arquivo extends File {

	public Arquivo(String nome, int tamanho) {
		this.nome = nome;
		this.tamanho = tamanho;
	}
	
	public Arquivo() {	}
	
	@Override
	public String toString() {
		return "Nome do Arquivo: " + nome + " Tamanho: " + tamanho(tamanho);
	}
	
	@Override
	public String tamanho(int t) {
		
		if(t > 1023) {
			return (t +"MB");
		}
		return super.tamanho(t);
	}
	
}
