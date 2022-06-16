package fundamentals;

import java.util.Scanner;

public class AddTwoNumber {

	public int addTwoNumbers(int a, int b){
		return a+b;
	}
	public static void main(String[] args) {
		AddTwoNumber addTwoNumber = new AddTwoNumber();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A value ?");
		int a = sc.nextInt();
		System.out.println("Enter B value ?");
		int b = sc.nextInt();
		System.out.println("C = "+addTwoNumber.addTwoNumbers(a, b));
		sc.close();

	}

}
