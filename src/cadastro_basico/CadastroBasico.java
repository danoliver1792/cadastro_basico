package cadastro_basico;

import java.util.Scanner;
import java.util.InputMismatchException;

public class CadastroBasico {
	private static String nome;
	private static int idade;
	private static double altura;
	private static float peso;
	
	
	public static void main(String[] args) {
		try {
			Scanner leitura = new Scanner(System.in);
			
			System.out.println("Digite seu nome: ");
			nome = leitura.nextLine();
			System.out.println("Digite sua idade: ");
			idade = leitura.nextInt();
			System.out.println("Digite sua altura: ");
			altura = leitura.nextDouble();
			System.out.println("Digite seu peso: ");
			peso = leitura.nextFloat();
			
			System.out.println("Prazer, " + nome);
			System.out.println("Você tem " + idade + " anos de idade, " + altura + " metros de altura e " + peso + " quilos");
		} catch(InputMismatchException e) {
			System.out.println("Erro! Use vírgula para valor decimal");
		}
	}
}
