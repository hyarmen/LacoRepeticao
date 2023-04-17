package LacoRepeticao;

import java.util.Scanner;

public class Exer2For {

	public static void main(String[] args) {

		int n1, n2, n3, n4, n5, n6, n7, n8, n9, n10, contPar=0, contImp=0;
		
		
		try (Scanner leia = new Scanner(System.in)) {
			System.out.println("Entre com o primeiro número: ");
			n1 = leia.nextInt();
			System.out.println("Entre com o segundo número: ");
			n2 = leia.nextInt();
			System.out.println("Entre com o terceiro número: ");
			n3 = leia.nextInt();
			System.out.println("Entre com o quarto número: ");
			n4 = leia.nextInt();
			System.out.println("Entre com o quinto número: ");
			n5 = leia.nextInt();
			System.out.println("Entre com o sexto número: ");
			n6 = leia.nextInt();
			System.out.println("Entre com o sétimo número: ");
			n7 = leia.nextInt();
			System.out.println("Entre com o oitavo número: ");
			n8 = leia.nextInt();
			System.out.println("Entre com o nono número: ");
			n9 = leia.nextInt();
			System.out.println("Entre com o décimo número: ");
			n10 = leia.nextInt();
		}
		
		for(int x = 0; x <= 10; x++){
			if(x%2==0) {
				contPar++;
			} else {
				contImp++;
			}
		}
		
		System.out.println("O total de números pares é: "+contPar);
		System.out.println("O total de números ímpares é: "+contImp);
	}

}
