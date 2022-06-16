package flowcontrolls;

import java.util.Scanner;

/**
 * 
 * @author cb21376 Find the Largest given numbers
 *
 */
public class FindLargestNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First,Second and Thrid Numbers ?");
		int firstNumber = sc.nextInt();
		int secondNumber = sc.nextInt();
		int thirdNumber = sc.nextInt();
		if (firstNumber > secondNumber && firstNumber > thirdNumber) {
			System.out.println("First Number is Largest Number");
		} else if (secondNumber > firstNumber && secondNumber > thirdNumber) {
			System.out.println("Second Number is Largest Number");
		} else if (thirdNumber > firstNumber && thirdNumber > secondNumber) {
			System.out.println("Third Number is Larget Number");
		} else {
			System.out.println("Any two or more numbers are equals");
		}
		sc.close();

	}

}
