import java.util.Scanner;

public class QuartoTeste {
	public static void main(String[] args) {
		Scanner texto = new Scanner(System.in);

		String nome;
		float n1, n2, n3, media;
 
		System.out.println("Entre com seu nome:");
		nome = texto.nextLine();
		System.out.println("Bem-vindo(a) " + nome);

		System.out.println("Insira a Nota 1:");
		n1 = texto.nextFloat();
		
		System.out.println("Insira a Nota 2:");
		n2 = texto.nextFloat();

		System.out.println("Insira a Nota 3:");
		n3 = texto.nextFloat();

		media = (n1 + n2 + n3) / 4;

		System.out.println("A media das notas eh igual a: " + media);

		if(media <= 7) {
			System.out.println("O aluno esta reprovado.");
		} else {
			System.out.println("O aluno esta aprovado.");
		}
	}
}