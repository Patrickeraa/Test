package pacote.main;
import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String nome;
		String sobrenome;
		int alturaCm;
		Double peso;
		int idade;
		
		
			
		//COMEÇO MENU
		System.out.println("Bem vindes!");
		System.out.println("Qual seu nome?");
		nome = scan.nextLine();
		System.out.println("Qual seu sobrenome?");
		sobrenome = scan.nextLine();
		System.out.println("Olá " + nome + " " + sobrenome + "!!!\n");
		
		System.out.println("Qual sua idade?");
		idade = scan.nextInt();
		
		System.out.println("Qual peso?");
		peso = scan.nextDouble();
		
		System.out.println("Qual sua altura?");
		alturaCm = scan.nextInt();
			
		Usuario usuario = new Usuario(nome, sobrenome,  alturaCm,  peso,  idade);
		
		System.out.println(usuario.nome);
		
		
	}

}
