package controller;

public class recursivaController {

	public recursivaController() {
		// TODO Auto-generated constructor stub
	}

	public int fat(int numero) {
		if (numero <= 1) { //Condicao de parada quando o numero for 1, usei menor ou igual porque podemos calcular se o numero foi 1
			return 1;
		} else {
			return numero * fat(numero - 1); //Condicao em que ele multiplica o numero pela instancia e diminui o numero
		}
	}
}
