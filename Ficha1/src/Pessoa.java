import java.util.Scanner;

public class Pessoa {
	private String nome;
	private int idade;

	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	public void ToString() {
		System.out.println("Nome: " + nome);
		System.out.println("Idade:" + idade);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nome:");
		String nome = scanner.nextLine();
		System.out.println("Idade:");
		int idade = scanner.nextInt();
		scanner.close();
		Pessoa pessoa = new Pessoa(nome, idade);
		pessoa.ToString();
	}
}
