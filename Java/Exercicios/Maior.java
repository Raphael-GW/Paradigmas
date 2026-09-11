import java.util.Scanner;

public class Maior{
	public static void main (String[] args){
		Scanner in = new Scanner(System.in);
		int num1, num2;

		System.out.print ("Digite dois numeros: ");
		num1 = in.nextInt();
		num2 = in.nextInt();

		if (num1 < num2){
			System.out.println (num1 + " " + num2);
		}
		else{
			System.out.println (num2 + " " + num1);
		}
		in.close();
	}
}
