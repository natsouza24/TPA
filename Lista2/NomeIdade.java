import java.util.Scanner;
public class NomeIdade {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		String nome, nomeMaior, nomeMenor;
		int idade, idadeMaior, idadeMenor;
		System.out.println("Insira o nome do 1� usu�rio:");
		nome = in.next();
		System.out.println("Insira a idade do 1� usu�rio:");
		idade = in.nextInt();
		nomeMaior = nome;
		idadeMaior = idade;
		nomeMenor = nome;
		idadeMenor = idade;
		System.out.println("\nInsira o nome do 2� usu�rio:");
		nome = in.next();
		System.out.println("Insira a idade do 2� usu�rio");
		idade = in.nextInt();
		if (idade>idadeMaior) {
			nomeMaior = nome;
			idadeMaior = idade;
		}else if (idade<idadeMenor) {
			nomeMenor = nome;
			idadeMenor = idade;
		}
		System.out.println("\nInsira o nome do 3� usu�rio:");
		nome = in.next();
		System.out.println("Insira a idade do 3� usu�rio:");
		idade = in.nextInt();
		if (idade>idadeMaior) {
			nomeMaior = nome;
			idadeMaior = idade;
		}else if (idade<idadeMenor) {
			nomeMenor = nome;
			idadeMenor = idade;
		}
		System.out.println("\nInsira o nome do 4� usu�rio:");
		nome = in.next();
		System.out.println("Insira a idade do 4� usu�rio:");
		idade = in.nextInt();
		if (idade>idadeMaior) {
			nomeMaior = nome;
			idadeMaior = idade;
		}else if (idade<idadeMenor) {
			nomeMenor = nome;
			idadeMenor = idade;
		}
		System.out.println("\nInsira o nome do 5� usu�rio:");
		nome = in.next();
		System.out.println("Insira a idade do 5� usu�rio:");
		idade = in.nextInt();
		if (idade>idadeMaior) {
			nomeMaior = nome;
			idadeMaior = idade;
		}else if (idade<idadeMenor) {
			nomeMenor = nome;
			idadeMenor = idade;
		}
		in.close();
		System.out.println("\nO usu�rio mais velho � "+nomeMaior+" que tem "+idadeMaior+" anos");
		System.out.println("\nO usu�rio mais novo � "+nomeMenor+" que tem "+idadeMenor+" anos");
	}

}