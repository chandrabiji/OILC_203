package flowcontrolls;

import java.util.Scanner;

/**
 * 
 * @author cb21376 Sample Switch application using number choice
 *
 */
public class SwitchWithNumber {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("------------------------------");
//		System.out.println("|     Switch Application     |");
//		System.out.println("------------------------------");
//		System.out.println("|   1. Add                   |");
//		System.out.println("|   2. Sub                   |");
//		System.out.println("|   3. Mul                   |");
//		System.out.println("|   4. Div                   |");
//		System.out.println("-------------------------------");
//		System.out.println("Enter Your Choice ?");
//		int choice = sc.nextInt();
//		System.out.println("Enter A value ?");
//		int a = sc.nextInt();
//		System.out.println("Enter B Value ?");
//		int b = sc.nextInt();
//		switch (choice) {
//		case 1:
//			System.out.println("Result = " + (a + b));
//			break;
//		case 2:
//			System.out.println("Result = " + (a - b));
//			break;
//		case 3:
//			System.out.println("Result = " + (a * b));
//			break;
//		case 4:
//			System.out.println("Result = " + (a / b));
//			break;
//		default:
//			System.out.println("Please select your choice range 1-4 only");
//
//		}
		
		Scanner sc = new Scanner(System.in);
		System.out.println("------------------------------");
		System.out.println("|     Switch Application     |");
		System.out.println("------------------------------");
		System.out.println("|   a. Add                   |");
		System.out.println("|   b. Sub                   |");
		System.out.println("|   c. Mul                   |");
		System.out.println("|   d. Div                   |");
		System.out.println("-------------------------------");
		System.out.println("Enter Your Choice ?");
		char choice = sc.next().charAt(0);
		System.out.println("Enter A value ?");
		int a = sc.nextInt();
		System.out.println("Enter B Value ?");
		int b = sc.nextInt();
		switch (choice) {
		case 'a':
			System.out.println("Result = " + (a + b));
			break;
		case 'b':
			System.out.println("Result = " + (a - b));
			break;
		case 'c':
			System.out.println("Result = " + (a * b));
			break;
		case 'd':
			System.out.println("Result = " + (a / b));
			break;
		default:
			System.out.println("Please select your choice range 1-4 only");

		}


	}

}
