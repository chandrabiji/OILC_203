package fundamentals;
class Parent{
	Parent(){
		//this(10);
		System.out.println("Parent default");
	}
	Parent(int a){
		this();
		System.out.println("Parent Parameterized");
	}
	
}
public class Child extends Parent{

	public Child() {
	    this(10);
		System.out.println("Child default");
		
	}
	
	public Child(int x){
		super(10);
		System.out.println("Child Parameterized");
	}

	public static void main(String[] args) {
		Child c = new Child();

	}

}
