package LacoRepeticao;

import java.util.Scanner;

public class Exer1For {

	public static void main(String[] args) {
		int n1, n2;
		
		try (Scanner leia = new Scanner(System.in)) {
			System.out.println("Entre com o primeiro número: ");
			n1 = leia.nextInt();
			System.out.println("Entre com o segundo número: ");
			n2 = leia.nextInt();
		}
		
		if(n1<n2) {
			for(int i = n1; i < n2; i++) {
				if(i%3==0 && i%5==0) {
					System.out.println(i+" é multiplo de 3 e 5.\n");
				}
			}
		} else {
			System.out.println("Intervalo inválido!");
		}
		
		

	}

}
