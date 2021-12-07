package br.com.aulas.Aula01;

public class ArrayIntroducao03 {

	// Podemos também inicializar um laço de repetição usando array, veja um
	// exemplo:

	public static void main(String[] args) {

		int[] idades = new int[5];

		/* Aqui iremos fazer com que a cada "espaço" da nossa array 
		 * multiplique com a quantidade que está no "idades". */

		for (int i = 0; i < idades.length; i++) {
			idades[i] = i * i;
		}
		/* Aqui iremos apenas fazer com que a cada laço, printe na 
		 * tela a multiplicação de cada laço completado.*/
		for (int i = 0; i < idades.length; i++) {
			System.out.println(idades[i]);
		}
	}
}