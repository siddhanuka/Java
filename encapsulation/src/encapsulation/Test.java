package encapsulation;

public class Test {

	private int size;
	
	public int getSize() {
		return size;
	}

	public void setSize(int s) {
		if(s>10){
			this.size=s;
		}
		else{
			System.out.println("sorry dog size cannot be less than 10");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t1=new Test();
		Test t2=new Test();
		Test t3=new Test();
		
		t1.setSize(42);
		t2.setSize(12);
		//t3.setSize(9);
		
		System.out.println("Dog 1 size is " +t1.getSize());
		System.out.println("Dog 2 size is " +t2.getSize());
		System.out.println("Dog 3 size is " +t3.getSize());

	}

}
