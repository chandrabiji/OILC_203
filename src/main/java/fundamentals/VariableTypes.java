package fundamentals;

public class VariableTypes {
    //instance variable
	int b = 20;
	//static variable
	static int c = 30;
	public static void main(String[] args) {
		VariableTypes obj = new VariableTypes();//Object or Instance
		//local variable
		int a = 10;
		System.out.println("A = "+a);
		System.out.println("B = "+obj.b);
		System.out.println("C = "+c);

	}
	public void m1(){
		System.out.println("B = "+b);
		System.out.println("C = "+c);
	}

}
