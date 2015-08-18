package zadaci_17_08_2015;

import java.util.Date;
/**
 * Employee class exteds Person class and has following data fields
 * office
 * salary
 * dateHired
 *
 */
public class Employee extends Person {
	int office;
	int salary;
	Date dateHired;

	Employee() {

	}
	//constructor where user inputs info for data fields
	public Employee(String name, String address, String phoneNumber,
			String emailAddress, int office, int salary) {
		super(name, address, phoneNumber, emailAddress);
		this.office = office;
		this.salary = salary;
		this.dateHired = new Date();
	}
	//get method for office data field
	public int getOffice() {
		return office;
	}
	//set method for office data field
	public void setOffice(int office) {
		this.office = office;
	}
	//get method for salary data field
	public int getSalary() {
		return salary;
	}
	//set method for salary data field
	public void setSalary(int salary) {
		this.salary = salary;
	}
	//get method for dateHired data field
	public Date getDateHired() {
		return dateHired;
	}
	//set method for dateHired data field
	public void setDateHired(Date dateHired) {
		this.dateHired = new Date();
	}
	//overriden method that prints object as class name and object name
	public String toString() {
		return "Employee " + getName();
	}
}
