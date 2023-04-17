package LacoRepeticao;

import java.util.Scanner;

public class Exer2While {

	public static void main(String[] args) {
		int idade, genero, cat, contNPB=0, contNMF=0, contHM40=0, contMF30=0;
		String escolha = "s";
		
		@SuppressWarnings("resource")
		Scanner leia = new Scanner(System.in);
		
		while(escolha.equalsIgnoreCase("s")) {
			System.out.println("\nDigite sua idade: ");
			idade = leia.nextInt();
			System.out.println("\nDigite o seu gênero: ");
			System.out.println("\n1 - Masculino \n2 - Feminino \n3 - Não se aplica");
			genero = leia.nextInt();
			System.out.println("\nDigite a categoria: ");
			System.out.println("\n1 - Backend \n2 - FrontEnd \n3 - Mobile \n4 - FullStack");
			cat = leia.nextInt();
			
			System.out.println("\n Deseja continuar? (S - Sim / N - Não");
			escolha = leia.next();
			
			if (cat==1) {
				contNPB++;
			} else if (genero==2 && cat==2) {
				contNMF++;
			} else if(idade>40 && genero==1 && cat==3) {
				contHM40++;
			} else if(idade<30 && genero==2 && cat==4) {
				contMF30++;
			}
		}
		
		System.out.println("\nTotal de pessoas desenvolvedoras BackEnd: "+contNPB);
		System.out.println("\nTotal de mulheres desenvolvedoras FrontEnd: "+contNMF);
		System.out.println("\nTotal de homens desenvolvedores mobile maiores de 40 anos: "+contHM40);
		System.out.println("\nTotal de mulheres desenvolvedoras FullStack menores de 30 anos: "+contMF30);

	}

}
