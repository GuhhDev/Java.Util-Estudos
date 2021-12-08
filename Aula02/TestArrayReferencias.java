package br.com.aulas.Aula02;

import br.com.aulas.Aula02.Modelo.Cliente;
import br.com.aulas.Aula02.Modelo.Conta;
import br.com.aulas.Aula02.Modelo.ContaCorrente;
import br.com.aulas.Aula02.Modelo.ContaPoupanca;

public class TestArrayReferencias {
	
	public static void main(String[] args) {
		
	// Aqui podemos instanciar uma variável do tipo mais genérico ou não	
	Object[] referencias = new Conta[5];
	
	ContaCorrente cc1 = new ContaCorrente(22,11);
	referencias[0] = cc1;

	ContaPoupanca cc2 = new ContaPoupanca(22, 22);
	referencias[1] = cc2;
	
	Cliente cliente = new Cliente();
	referencias[2] = cliente;
	
	
	//System.out.println(cc2.getNumero());
	
	//System.out.println(referencias[1].getNumero());
	
	/**
	 *  Aqui precisamos fazer um "Cast", que é forçar a ref
	 *  a ser do tipo mais específico, garantindo ao compilador 
	 *  que tudo irá dar certo, visto que na classe Object, que é 
	 *  onde estamos chamando as referencias, não existe getNumero; 
	 */
	
	ContaPoupanca ref = (ContaPoupanca) referencias[1];
	System.out.println(ref.getNumero());
	System.out.println(cc2.getNumero());
	}	
}