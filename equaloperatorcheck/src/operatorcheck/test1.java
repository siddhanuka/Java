package operatorcheck;

public class test1 {

	
	public static void main(String[] args) {
		test1 a=new test1();
		test1 b=new test1();
		a=b;
		if(a==b){
			System.out.println("both reference refer to same objec");
		}
//		else{
//			a=b;
//			System.out.println("both reference refer to same object");
//		}
		
		
	}

}
