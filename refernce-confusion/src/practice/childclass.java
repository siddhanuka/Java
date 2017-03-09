package practice;

public class childclass extends Parentclass {
		public void method3(){
			System.out.println("in child class mehtod3");
		}
		public void method1(){
			System.out.println("in child class method1");
		}
	
	public static void main(String[] args) {
		Parentclass a=new Parentclass();
		a.method1();
		
	}

}
