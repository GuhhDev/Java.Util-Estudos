package br.com.aulas.Aula01;

public class ArrayIntroducao02 {
	
	/**
	 * Agora imaginem isso com 100, 200 valores... Imaginem o trabalho que daria para
	 * preencher todos os valores, ou talvez fazer altera��o em alguns... Seria um desastre!
	 * Para salvar-nos, existe algo chamado Array, ou estrutura de dados. Raramente ser�o usados
	 * da maneira que usaremos agora, mas para fins did�ticos usaremos de forma manual, para
	 * conseguirmos a compreens�o de como funciona. No array, usaremos sempre "[]" para 
	 * representar nossas cadeias de dados, sempre logo depois do tipo da vari�vel.
	 * Veja agora como � usado o exemplo de Array:
	 */

	public static void beta(String[] args) {
	
		// Declara��o de vari�vel com array, desta maneira, ser� sempre necess�rio adicionar a quantidade;
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