package LacoRepeticao;

import java.util.Scanner;

public class Exer1While {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int numero,contMenor=0,contMaior=0;
		
		System.out.println("\nEntre com um número: ");
		numero = leia.nextInt();
		

		
		while(numero >= 0) {
			
			if(numero<21) {
				contMenor++;
			}else if(numero>50){
				contMaior++;
			}
			System.out.println("\nEntre com um número: ");
			numero = leia.nextInt();
		}
		
		System.out.println("\nTotal de pessoas menores de 21 anos: "+contMenor);
		System.out.println("\nTotal de pessoas maiores de 50 anos: "+contMaior);

	}

}
