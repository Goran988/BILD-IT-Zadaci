package zadaci_20_08_2015;

/**
 * class that tests if method will cause exception throws
 */
public class IllegalArgumentExceptionTest {
	public static void main(String[] args) {
		Loan loan = new Loan();
		//setting loan amount as negative number
		loan.setLoanAmount(-25);
		System.out.println(loan.getLoanAmount());
		//using zero in constructor
		Loan l1 = new Loan(0, 25, 1000);
		System.out.println(l1.getLoanAmount());
	}
}
