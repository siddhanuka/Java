package encapsulation;

public class Arraytest {

	int size;
	
	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public static void main(String[] args) {
		Arraytest[] test=new Arraytest[3];
		test[0]=new Arraytest();
		test[1]=new Arraytest();
		
		test[0].setSize(23);
		test[1].setSize(12);
		
		System.out.println("dog 1 size is "+test[0].getSize() );
		System.out.println("dog 2 size is "+test[1].getSize());
		

	}

}
