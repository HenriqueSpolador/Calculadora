package calculadora;

import java.util.Scanner;

public class Main {

	public static void main (String [] args) {

		Scanner scanner = new Scanner (System.in);
		
		Numero n1 = new Numero (0);
		Numero n2 = new Numero (0);
		Numero resultado = new Numero (0);
		int opcao;
		String opc = "s";
		
		while (opc.equalsIgnoreCase("s")) {	

			System.out.println ("--- CALCULADORA ---");		
			System.out.println ("\nEscolha o operador:");
			System.out.println ("\n1 - Somar");
			System.out.println ("2 - Subtrair");
			System.out.println ("3 - Multiplicar");
			System.out.println ("4 - Dividir");

			opcao = scanner.nextInt();


			if (opcao == 1) {

				System.out.println ("--- SOMAR ---");
				System.out.println ("\nDigite o primeiro n�mero");
				n1.setValor(scanner.nextDouble());
				System.out.println ("Digite o segundo n�mero");
				n2.setValor(scanner.nextDouble());
				resultado.setValor(n1.getValor() + n2.getValor());
				System.out.println ("O resultado �: " + resultado.getValor());
				System.out.println ("Deseja realizar outra opera��o?");
				opc = scanner.next();			

			}

			if (opcao == 2) {

				System.out.println ("--- SUBTRAIR ---");
				System.out.println ("\nDigite o primeiro n�mero");
				n1.setValor(scanner.nextDouble());
				System.out.println ("Digite o segundo n�mero");
				n2.setValor(scanner.nextDouble());
				resultado.setValor(n1.getValor() - n2.getValor());
				System.out.println ("O resultado �: " + resultado.getValor());
				System.out.println ("Deseja realizar outra opera��o?");
				opc = scanner.next();

			}

			if (opcao == 3) {

				System.out.println ("--- MULTIPLICAR ---");
				System.out.println ("\nDigite o primeiro n�mero");
				n1.setValor(scanner.nextDouble());
				System.out.println ("Digite o segundo n�mero");
				n2.setValor(scanner.nextDouble());
				resultado.setValor(n1.getValor() * n2.getValor());
				System.out.println ("O resultado �: " + resultado.getValor());
				System.out.println ("Deseja realizar outra opera��o?");
				opc = scanner.next();

			}

			if (opcao == 4) {

				System.out.println ("--- DIVIDIR ---");
				System.out.println ("\nDigite o primeiro n�mero");
				n1.setValor(scanner.nextDouble());
				System.out.println ("Digite o segundo n�mero");
				n2.setValor(scanner.nextDouble());
				resultado.setValor(n1.getValor() / n2.getValor());
				System.out.println ("O resultado �: " + resultado.getValor());
				System.out.println ("Deseja realizar outra opera��o?");
				opc = scanner.next();

			}
		}
	}
}
