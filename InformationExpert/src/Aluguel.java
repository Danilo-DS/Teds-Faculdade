import java.util.ArrayList;
import java.util.Collection;

public class Aluguel {
	private Fita fita;
    private int diasAlugada;
    private Cliente cliente;
    private Collection<Fita> fitas = new ArrayList<Fita>();

    public Aluguel(Fita fita, int diasAlugada, Cliente cliente) {
        this.fita = fita;
        this.diasAlugada = diasAlugada;
        this.cliente = cliente; 
    }

    public Fita getFita() {
        return fita;
    }

    public int getDiasAlugada() {
        return diasAlugada;
    }
        
    public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public String extrato() {
        final String fimDeLinha = System.getProperty("line.separator");
        double valorTotal = 0.0;
        int pontosDeAlugadorFrequente = 0;
        String resultado = "Registro de Alugueis de " + cliente.getNome() + fimDeLinha;

        for (Fita f : fitas ) {

            double valorCorrente = 0.0;
            Fita cada = f;

            // determina valores para cada linha
            // switch com enum
            switch (cada.getCódigoDePreço()) {
            case normal:
                valorCorrente += 2;
                if (diasAlugada  > 2) {
                    valorCorrente += (diasAlugada - 2) * 1.5;
                }
                break;
            case lancamento:
                valorCorrente += diasAlugada * 3;
                break;
            case infantil:
                valorCorrente += 1.5;
                if (diasAlugada > 3) {
                    valorCorrente += (diasAlugada - 3) * 1.5;
                }
                break;
            } // switch
            // trata de pontos de alugador frequente
            pontosDeAlugadorFrequente++;
            // adiciona bonus para aluguel de um lançamento por pelo menos 2
            // dias
            if (cada.getCódigoDePreço() == Tipo.lancamento
                && diasAlugada > 1) {
                pontosDeAlugadorFrequente++;
            }

            // mostra valores para este aluguel
            resultado += "\t" + cada.getTítulo() + "\t"
                         + valorCorrente + fimDeLinha;
            valorTotal += valorCorrente;
        } // while
        // adiciona rodapé
        resultado += "Valor total devido: " + valorTotal + fimDeLinha;
        resultado += "Voce acumulou " + pontosDeAlugadorFrequente
                     + " pontos de alugador frequente";
        return resultado;
    }
}
