package br.com.aulas.Aula04;

import java.util.ArrayList;

import br.com.aulas.Aula02.Modelo.Conta;
import br.com.aulas.Aula02.Modelo.ContaCorrente;

public class TesteArrayList {

	public static void main(String[] args) {

		// <> se chama Generics
		//Cria arrayList do tipo object, mas só puxa o Conta
		ArrayList<Conta> lista = new ArrayList<Conta>();
		
		ArrayList<String> nome = new ArrayList<String>();

		Conta cc = new ContaCorrente(22, 11);
		lista.add(cc);
		
		Conta cc2 = new ContaCorrente(22, 22);
		lista.add(cc2);
		
		Conta cc3 = new ContaCorrente(23, 23);
		lista.add(cc3);
		
		System.out.println(lista.size());
		
		// Se é especificado no arrayList, não precisa do cast
		//Conta ref = (Conta) lista.get(0);
		Conta ref = lista.get(0);
		
		System.out.println(ref.getNumero());
		
		lista.remove(0);
		
		System.out.println("tamanho: " + lista.size());
		
		Conta cc4 = new ContaCorrente(72, 77);
		lista.add(cc2);
		
		Conta cc5 = new ContaCorrente(44, 43);
		lista.add(cc3);
		
		for (int i = 0; i < lista.size(); i++) {
			Object oRef = lista.get(i);
			System.out.println(oRef);
			
		}
			
		System.out.println("-----------------");
		
		for (Object oRef : lista) {
			System.out.println(oRef);
		}
	}
}
