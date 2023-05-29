import java.util.Scanner;

public class SegundoTeste {
	public static void main(String[] args) {
		Scanner texto = new Scanner(System.in); //entrada pelo teclado

		String nome;
		int idade;

		System.out.println("Meu segundo pgm em Java!! Uhuuu!"); // println com quebra de linha
		System.out.println("Entre com seu nome:");
		nome = texto.nextLine();
		System.out.println("Bem-vindo(a) " + nome);

		System.out.println("Entre com a sua idade:");
		idade = texto.nextInt();
		System.out.println("Você tem: " + idade + " anos.");
	}
}