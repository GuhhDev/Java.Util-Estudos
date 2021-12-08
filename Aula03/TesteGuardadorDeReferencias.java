package br.com.aulas.Aula03;

import br.com.aulas.Aula02.Modelo.Conta;
import br.com.aulas.Aula02.Modelo.ContaCorrente;

public class TesteGuardadorDeReferencias {

	public static void main(String[] args) {
		
		// Instanciado a classe que é Object
		GuardadorDeReferencias guardador = new GuardadorDeReferencias();
		
		Conta cc = new ContaCorrente(22, 11);
		guardador.adiciona(cc);
		
		Conta cc2 = new ContaCorrente(22, 22);
		guardador.adiciona(cc2);
		
		Conta cc3 = new ContaCorrente(23, 23);
		guardador.adiciona(cc3);
		
		int tamanho = guardador.getQuantidadeDeElementos();
		System.out.println(tamanho);
		
		// Aqui existe um cast para forçar algo genérico ser mais específico
		Conta ref = (Conta) guardador.getReferencia(1);
		System.out.println(ref.getNumero());
		
	}
}
