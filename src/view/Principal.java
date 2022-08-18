package view;

import java.util.Scanner;

import controller.recursivaController;

public class Principal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numero = scan.nextInt();
		scan.close();
		int resultado = 0;
		
		recursivaController fator = new recursivaController();
		resultado = fator.fat(numero);
		System.out.println(resultado);
	}

}
