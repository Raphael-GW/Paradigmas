import java.util.Scanner;

public class teste{

	//Método que inicia a execução do aplicativo Java
	public static void main (String args[]){

		Scanner input = new Scanner(System.in);

		String num;
		System.out.println("digite um número ");
		num = input.nextLine ();

		System.out.println("O número digitado foi: " + num);
		input.close();
	}
}
