import java.util.Scanner;

public class QuartoTeste {
	public static void main(String[] args) {
		Scanner texto = new Scanner(System.in);

		String nome, formacao, funcao;
		int idade;
 
		System.out.println("Entre com seu nome:");
		nome = texto.nextLine();
		System.out.println("Bem-vindo(a) " + nome);

		System.out.println("Entre com a sua idade:");
		idade = texto.nextInt();
		texto.nextLine();
		System.out.println("Você tem: " + idade + " anos.");

		System.out.println("Qual eh o seu papel no demoday?");
		funcao = texto.nextLine();
		System.out.println("Voce atua como " + funcao);

		System.out.println("Qual a sua formacao?");
		formacao = texto.nextLine();
		System.out.println("Voce eh " + formacao);

		System.out.println("Seu nome eh " + nome + ", voce tem " + idade + ". Atua como " + funcao + " e eh formado em " + formacao + ".");
	}
}