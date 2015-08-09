package zadaci_09_08_2015;

public class AccountTest {

	public static void main(String[] args) {
		Account a1 = new Account(1122, 20000, 4.5);		//creating new account object
		a1.withdraw(2500);								//withdrawing funds from account
		a1.deposit(3000);								//depositing funds to account
		System.out.println("Balance on account is: " + a1.getBalance()		//printing out balance, monthly interest and date account object is created
				+ "\nMonthly rate is: " + a1.getMonthlyInterest()
				+ "\nAccount is created on: " + a1.getDate());
	}

}
