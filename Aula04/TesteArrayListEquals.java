package br.com.aulas.Aula04;

import java.util.ArrayList;

import br.com.aulas.Aula02.Modelo.Conta;
import br.com.aulas.Aula02.Modelo.ContaCorrente;

public class TesteArrayListEquals {

	public static void main(String[] args) {
		
//		Conta cc1 = new ContaCorrente(22, 11);
//		Conta cc2 = new ContaCorrente(22, 11);
//
//		boolean igual = cc1.ehIgual(cc2);
//		System.out.println(igual);
		
//		// <> se chama Generics
//		//Cria arrayList do tipo object, mas só puxa o Conta
		ArrayList<Conta> lista = new ArrayList<Conta>();
		

		Conta cc = new ContaCorrente(22, 11);
		lista.add(cc);
		
		Conta cc2 = new ContaCorrente(22, 22);
		lista.add(cc2);
		
		Conta cc3 = new ContaCorrente(22,22);
		boolean existe = lista.contains(cc3);
		
		System.out.println("Já existe? " + existe);
		
		for (Conta conta : lista) {
			System.out.println(conta);
		}
		
	}
}
