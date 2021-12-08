package br.com.aulas.Aula03;

import br.com.aulas.Aula02.Modelo.Conta;

public class GuardadorDeReferencias {

	// Aqui é instanciado uma variável do tipo Object, que referencia tudo 
	// (veremos que isso é um problema!)
	
	private Object[] referencias;
	private int posicaoLivre;
	
	public GuardadorDeReferencias() {
		this.referencias = new Conta[10];
		this.posicaoLivre = 0;
	}
	
	public void adiciona (Object ref) {
		this.referencias[this.posicaoLivre] = ref;
		this.posicaoLivre++;
	}

	public int getQuantidadeDeElementos() {
		return this.posicaoLivre;
	}

	public Object getReferencia(int i) {
		
		return this.referencias[i];
	}
}