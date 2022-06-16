package flowcontrolls;

public class ContinueDemo {

	public static void main(String[] args) {
		for(int i=1;i<=10;++i){
			if(i==5)
				continue;
			System.out.println(i);
		}
		int k=1;
		for(;k<=5;++k);
		System.out.println(k);

	}

}
