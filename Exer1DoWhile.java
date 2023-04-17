package LacoRepeticao;

import java.util.Scanner;

public class Exer1DoWhile {

	public static void main(String[] args) {
		int num, somaPos=0;
		
		@SuppressWarnings("resource")
		Scanner leia = new Scanner(System.in);
		
		do {
			System.out.println("\nEntre com um número: ");
			num = leia.nextInt();
			if(num>0) {
				somaPos += num;
			}
		}
		while(num<0 || num>0);
		
		System.out.println("\nA soma dos números positivos é: "+somaPos);
	}

}
