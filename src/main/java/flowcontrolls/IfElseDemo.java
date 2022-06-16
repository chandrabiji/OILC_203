package flowcontrolls;

import java.util.Scanner;

/**
 * 
 * @author cb21376
 * Given Number is Even Or Odd Number
 *
 */
public class IfElseDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ?");
		int number = sc.nextInt();
		if(number%2==0){
			System.out.println("Given Number is Even Number");
		}else{
			System.out.println("Given Number is Odd Number");
		}
		sc.close();

	}

}
