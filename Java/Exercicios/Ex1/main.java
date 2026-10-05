import java.util.Scanner;

public class Main {
	public static void main (String[] args){
		Scanner leitor = new Scanner(System.in);
		
		System.out.println ("Digite o nome do livro: ");
		String titulo = leitor.nextLine();
		
		System.out.println ("Digite o ano do livro: ");
        String ano = leitor.nextLine();	

		System.out.println ("Digite o nome do autor: ");
		String nome = leitor.nextLine();

		System.out.println ("Digite a nacionalidade do autor: ");
        String pais = leitor.nextLine();

		Autor autor = new Autor (nome, pais);
		
		Livro livro = new Livro (titulo, ano, autor);
		
		livro.imprimir()
	}
