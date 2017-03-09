package enhancedforloop;

public class looptest {
        
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int x=0;
		String[] arrayname={"amit","rony","fred"};
		for(String name:arrayname){
			x++;
			System.out.println("number of times loop run "+x );
			System.out.println("the name is "+name);
			
			
		}

	}

}
