package Exception;

public class ExceptionTest  {
      int a=34;
	public void divide()throws Exception{
		int b=0;
		System.out.println("first step");
		int c =a/b;
		System.out.println("second step");
		System.out.println("the answer is "+c);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         ExceptionTest c=new ExceptionTest();
         try{
         c.divide();
         }
         catch(Exception e){
        	 System.out.println("hiii");
        	 e.printStackTrace();
        	 
         }
         
	}

}
