package knightingale;
import java.util.Scanner;

public class Multiply2number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the first number");
		int n1= reader.nextInt();
		System.out.println("Enter he second number");
		int n2=reader.nextInt();
		int mul=n1*n2;
		
		System.out.println("The multiplication of the two number is : "+mul);

	}

}
