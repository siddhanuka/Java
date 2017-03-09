package ryanandmonica;

public class ryanandmonicajob implements Runnable {

	Bankaccount account=new Bankaccount();
	public static void main(String[] args) {
		Runnable r=new ryanandmonicajob();
		
		Thread one=new Thread(r);
		Thread two=new Thread(r);
		
		one.setName("Ryan");
		two.setName("Monica");
		
		one.start();
		two.start();
	}

	@Override
	public void run() {
		
		for(int i=0; i<=10 ; i++){
			if(account.getBalance()<=10){
				System.out.println("overdrawn");
			}
			makewithdrawl(10);
		}
		
	}

	private void makewithdrawl(int amount) {
		
		if(account.getBalance()>=amount){
			System.out.println(Thread.currentThread().getName()+"is about to withdraw");
			try {
				System.out.println(Thread.currentThread().getName()+"is about to sleep");
				Thread.sleep(500);
				
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+"woke up");
			account.withdraw(amount);
			System.out.println(Thread.currentThread().getName()+"completes the withdrawn");
		}else{
			System.out.println("Not enough amount");
		}
		
	}

}
