package modelC;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class PastaComposta extends File{
	
	HashMap<String, File> p;	
	public PastaComposta(String nm) {
		p = new LinkedHashMap<>();
		this.nome = nm;
	}
	
	public PastaComposta() {}
	
	@Override
	public void adicionar(File f) {
		super.adicionar(f);
		p.put(f.nome + " " + f.tamanho(f.tamanho), f);
		this.tamanho += f.tamanho;
		System.out.println("Adicionado a " + this.nome);
	}
	@Override
	public void listarArquivos() {
		super.listarArquivos();
		System.out.println("---> Lista Arquivos da Pasta:" + this.nome + " Tamanho Geral " + tamanho(this.tamanho)); 
		
		for (Map.Entry<String, File> key : p.entrySet()) {
			System.out.println(key.getKey());
		}
	}
	
	@Override
	public String tamanho(int t) {
		if(t > 1023) 
			return (t +"MB");
		
		return super.tamanho(t);
	}
	
	@Override
	public String toString() {
		if (p.size() != 0)
			return p.toString();

		return super.toString();
	}
		
	@Override
	public String excluir(String nome) {
		for (Map.Entry<String, File> arq : p.entrySet()) {
			if(arq.getKey().indexOf(nome) != -1) {
				this.tamanho = this.tamanho - arq.getValue().tamanho;
				p.remove(arq.getKey(), arq.getValue());
				return "Arquivo"+nome+" Deletado com Sucesso";
			}
		}
		return super.excluir(nome);
	}
}
