package org.base;

public class EmployeeInfo {

	private void details(String name) {
		this.details("Lais", 4387543);
		System.out.println("Employee name is :" + name);
	}

	private void details(String name, int empId) {
		this.details(937439843l);
		System.out.println("Employee name is :" + name);
		System.out.println("Employee id is :" + empId);
	}

	private void details(long phone) {
		this.details(284243.33545f);
		System.out.println("Employee phone is :" + phone);
	}

	private void details(float salary) {
		this.details('M', 34938795);
		System.out.println("Employee salary is :" + salary);
	}

	private void details(char gender, int id) {
		this.details(32498483, 'F');
		System.out.println("Employee gender is :" + gender + "\t" + "Employee id is :" + id);
	}

	private void details(int id, char gender) {
		System.out.println("Employee id is :" + id + "\t" + "Employee gender is :" + gender);
	}

	public static void main(String[] args) {

		EmployeeInfo e = new EmployeeInfo();
		e.details("Jack");

	}

}
