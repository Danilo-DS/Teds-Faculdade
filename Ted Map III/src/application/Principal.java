package application;

import state.Lampada;
import state.LampadaCurto;
import state.LampadaDesligada;
import state.LampadaLigada;


public class Principal {
	
    public static void main(String[] args) {
    	 
    	Lampada l = new Lampada();
    	LampadaDesligada ld = new LampadaDesligada();
    	LampadaLigada ll = new LampadaLigada();
    	LampadaCurto lc = new LampadaCurto();
    	
    	System.out.println(ld.estado(l));
    	System.out.println(ll.estado(l));
    	System.out.println(lc.estado(l));

    	
	}
}
