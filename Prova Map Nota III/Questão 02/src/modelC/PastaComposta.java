package modelC;

import java.util.ArrayList;

import java.util.List;

public class PastaComposta extends File{
	
	private List<String> pasta;
	int t = 0; //tamanho
	
	public PastaComposta(String nm) {
		pasta =  new ArrayList<String>();
		this.nome = nm;
	}
	
	public PastaComposta() {}
	
	@Override
	public void adicionar(File f) {
		super.adicionar(f);
		pasta.add(f.exibir());
		System.out.println("Adicionado a " + this.nome);
	}
	
	@Override
	public void listarArquivos() {
		super.exibir();
		System.out.println("---> Lista Arquivos da Pasta:" + this.nome);
		
		for (int i = 0; i < pasta.size(); i++) {			
			System.out.println(pasta.get(i));		
		}	
	}
	
	
	 public String exibir() { 
		 if (pasta.size() != 0 ) { return "--->Arquivos da " + this.nome
		 +"\n" + pasta; 
		 } else return super.exibir(); 
	 }

	@Override
	public String excluir(String nome) {
		for (int i = 0; i < pasta.size(); i++) {
			if(pasta.get(i).indexOf(nome) != -1) {
				pasta.remove(i);
				return "Arquivo "+nome+" Deletado com Sucesso";
			}
		}
		return super.excluir(nome);
	}
	
}
