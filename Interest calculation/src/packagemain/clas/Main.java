package packagemain.clas;

import packagebank.service.BankService;

public class Main {
	public static void main(String a[])

	{

	int tenure = 5;

	float principal = 1000;

	int age = 23;

	String gender = "Male";

	BankService b=new BankService();

	b.calculate(principal, tenure, age, gender);

	}
}
