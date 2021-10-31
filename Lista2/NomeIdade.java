import java.util.Scanner;
public class NomeIdade {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		String nome, nomeMaior, nomeMenor;
		int idade, idadeMaior, idadeMenor;
		System.out.println("Insira o nome do 1º usuário:");
		nome = in.next();
		System.out.println("Insira a idade do 1º usuário:");
		idade = in.nextInt();
		nomeMaior = nome;
		idadeMaior = idade;
		nomeMenor = nome;
		idadeMenor = idade;
		System.out.println("\nInsira o nome do 2º usuário:");
		nome = in.next();
		System.out.println("Insira a idade do 2º usuário");
		idade = in.nextInt();
		if (idade>idadeMaior) {
			nomeMaior = nome;
			idadeMaior = idade;
		}else if (idade<idadeMenor) {
			nomeMenor = nome;
			idadeMenor = idade;
		}
		System.out.println("\nInsira o nome do 3º usuário:");
		nome = in.next();
		System.out.println("Insira a idade do 3º usuário:");
		idade = in.nextInt();
		if (idade>idadeMaior) {
			nomeMaior = nome;
			idadeMaior = idade;
		}else if (idade<idadeMenor) {
			nomeMenor = nome;
			idadeMenor = idade;
		}
		System.out.println("\nInsira o nome do 4º usuário:");
		nome = in.next();
		System.out.println("Insira a idade do 4º usuário:");
		idade = in.nextInt();
		if (idade>idadeMaior) {
			nomeMaior = nome;
			idadeMaior = idade;
		}else if (idade<idadeMenor) {
			nomeMenor = nome;
			idadeMenor = idade;
		}
		System.out.println("\nInsira o nome do 5º usuário:");
		nome = in.next();
		System.out.println("Insira a idade do 5º usuário:");
		idade = in.nextInt();
		if (idade>idadeMaior) {
			nomeMaior = nome;
			idadeMaior = idade;
		}else if (idade<idadeMenor) {
			nomeMenor = nome;
			idadeMenor = idade;
		}
		in.close();
		System.out.println("\nO usuário mais velho é "+nomeMaior+" que tem "+idadeMaior+" anos");
		System.out.println("\nO usuário mais novo é "+nomeMenor+" que tem "+idadeMenor+" anos");
	}

}