package zadaci_09_08_2015;

import java.util.Date;

/**
 * Class that contains data fields ID, balance, annual interest rate and date
 * created.Set/get methods with other balance related methods such as deposit
 * and withdraw.
 *
 */
public class Account {
	private int ID = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private Date dateCreated;

	Account() {									//default constructor

	}

	Account(int newID, double newBalance, double newAnnualInterestRate) {		//constructor with id, balance and interest rate datafields

		ID = newID;
		balance = newBalance;
		annualInterestRate = newAnnualInterestRate;
		dateCreated = new Date();
	}

	public void setID(int newID) {
		ID = newID;
	}

	public int getID() {
		return ID;
	}

	public void setBalance(double newBalance) {
		balance = newBalance;
	}

	public double getBalance() {
		return balance;
	}

	public double getMonthlyInterestsRate() {				//method that calculates monthly interests rate
		return (annualInterestRate / 100) / 12;
	}

	public double getMonthlyInterest() {					//method that calculates monthly interest
		return balance * ((annualInterestRate / 100) / 12);
	}

	public Date getDate() {
		return dateCreated;
	}

	public void deposit(double deposit) {					//method that adds funds to the balance
		balance += deposit;
	}

	public void withdraw(double withdraw) {					//method that checks if withdrawal is posible and than remove funds from account
		if (balance - withdraw >= 0) {
			balance = balance - withdraw;

		}
	}
}
