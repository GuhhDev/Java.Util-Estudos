package br.com.aulas.Aula01;

public class ArrayIntroducao03 {

	// Podemos tamb�m inicializar um la�o de repeti��o usando array, veja um
	// exemplo:

	public static void main(String[] args) {

		int[] idades = new int[5];

		/* Aqui iremos fazer com que a cada "espa�o" da nossa array 
		 * multiplique com a quantidade que est� no "idades". */

		for (int i = 0; i < idades.length; i++) {
			idades[i] = i * i;
		}
		/* Aqui iremos apenas fazer com que a cada la�o, printe na 
		 * tela a multiplica��o de cada la�o completado.*/
		for (int i = 0; i < idades.length; i++) {
			System.out.println(idades[i]);
		}
	}
}