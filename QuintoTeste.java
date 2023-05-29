import java.util.Scanner;

public class QuintoTeste {
	public static void main(String[] args) {
		Scanner texto = new Scanner(System.in);

		Double peso, altura, imc;
		 
		System.out.println("Informe o peso:");
		peso = texto.nextDouble();
		
		System.out.println("Informe a altura");
		altura = texto.nextDouble();

		imc = peso / Math.pow(altura,2);

		System.out.println("IMC de " + imc);

		if(imc <= 18.5) {
			System.out.println("Abaixo do peso");
		} else if(imc <= 24.9) {
			System.out.println("Peso normal");
		} else if(imc <= 29.9) {
			System.out.println("Sobrepeso");
		} else if(imc <= 34.9) {
			System.out.println("Obesidade grau II");
		} else if(imc <= 39.9) {
			System.out.println("Obesidade morbida");
		}
	}
}