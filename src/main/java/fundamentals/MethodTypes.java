package fundamentals;

public class MethodTypes {

	//Instance Methods
	public void sayHello(String name){
		System.out.println("Welcome to Ojas Mr. "+name);
	}
	
	public int add(int i, int j){
		return i+j;
	}
	//Static Method
	public static void m1(){
		System.out.println("From Static Method");
	}
	//Final Method
	public final void m2(){
		System.out.println("From Final Method");
	}
	//abstract method
	//public abstract void m3();
	public synchronized void m4(){
		System.out.println("From synchronized Method");
	}
	public static void main(String[] args) {
		MethodTypes obj = new MethodTypes();
		obj.sayHello("Siva");
		System.out.println(obj.add(10, 20));
		m1();
		obj.m2();
		obj.m4();

	}

}
