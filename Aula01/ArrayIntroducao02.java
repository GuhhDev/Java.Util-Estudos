package br.com.aulas.Aula01;

public class ArrayIntroducao02 {
	
	/**
	 * Agora imaginem isso com 100, 200 valores... Imaginem o trabalho que daria para
	 * preencher todos os valores, ou talvez fazer alteração em alguns... Seria um desastre!
	 * Para salvar-nos, existe algo chamado Array, ou estrutura de dados. Raramente serão usados
	 * da maneira que usaremos agora, mas para fins didáticos usaremos de forma manual, para
	 * conseguirmos a compreensão de como funciona. No array, usaremos sempre "[]" para 
	 * representar nossas cadeias de dados, sempre logo depois do tipo da variável.
	 * Veja agora como é usado o exemplo de Array:
	 */

	public static void beta(String[] args) {
	
		// Declaração de variável com array, desta maneira, será sempre necessário adicionar a quantidade;
		int[] valor = new int[5];
		
		valor[0] = 29;
		valor[1] = 39;
		valor[2] = 49;
		valor[3] = 59;
		valor[4] = 69;
		valor[5] = 79;
		
		int idadeGustavo = valor[0];
		
		System.out.println(idadeGustavo);
	}
}