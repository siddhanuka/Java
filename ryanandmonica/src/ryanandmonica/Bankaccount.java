package ryanandmonica;

public class Bankaccount {
	private int balance=100;
	
	public int getBalance(){
		return balance;
	}
	
	public void withdraw(int amount){
		
		balance=balance-amount;
		System.out.println("current balance is "+balance );
	}
	
	

}
