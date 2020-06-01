package modelC;

public class File {
	protected String nome;
	protected int tamanho;
	
	public File() {
	}
	
	public void adicionar(File f) {}
	
	public void listarArquivos() {}
	
	@Override
	public String toString() {
		return "Nenhum Arquivo ou Pasta Encontrado";
	}

	public String tamanho(int t) {return t + "kb";}
	
	public String excluir(String nome) {return "Arquivo " +nome+ " não Encontrado";}
}
