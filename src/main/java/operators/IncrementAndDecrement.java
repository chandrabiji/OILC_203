package operators;

public class IncrementAndDecrement {

	public static void main(String[] args) {
		System.out.println("--Pre Increment--");
		int a = 10;
		System.out.println("A = "+a);//10
		int b = ++a;
		System.out.println("B = "+b);//11
		System.out.println("A = "+a);//11
		System.out.println("--post Increment--");
		int x = 8;
		System.out.println("X = "+x);//8
		int y = x++;
		System.out.println("Y = "+y);//8
		System.out.println("X = "+x);//9
		System.out.println("--Pre Decrement--");
		int p = 7;
		System.out.println("P = "+p);//7
		int q = --p;
		System.out.println("Q = "+q);//6
		System.out.println("P = "+p);//6
		System.out.println("--Post Decrement--");
		int i=6;
		System.out.println("I = "+i);//6
		int j = i--;
		System.out.println("J = "+j);//6
		System.out.println("I = "+i);//5
		
		System.out.println((i++)+(--j)+(++i)+(j--));
		

	}

}
