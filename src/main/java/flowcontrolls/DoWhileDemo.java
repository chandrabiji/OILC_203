package flowcontrolls;

/**
 * 
 * @author cb21376
 * Print 1.. 10 Numbers
 *
 */
public class DoWhileDemo {

	public static void main(String[] args) {
		int i = 1,sum=0;
		do {
			System.out.println(i);
			sum +=i;
			++i;
		}while(i<=10);
		System.out.println("Sum = "+sum);

	}

}
