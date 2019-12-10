class Person
{
	String name;
}

class Employee extends Person
{
	double annualSalary;
	int yearOfJoin;
	String insuranceNumber;
}

class Test extends Employee
{
	Test(String name, double salary, int year, String insurance)
	{
		super.name = name;
		super.annualSalary = salary;
		super.yearOfJoin = year;
		super.insuranceNumber = insurance;
	}
	String getName()
	{
		return name;
	}
	String getInsurance()
	{
		return insuranceNumber;
	}
	double getSalary()
	{
		return annualSalary;
	}
	int getYear()
	{
		return yearOfJoin;
	}
}

class E41
{
	public static void main(String args[])
	{
		Test t = new Test("Purvaja", 2000000, 2022, "100002000");
		System.out.println("Employee Name : "+t.getName());
		System.out.println("Employee Annual Salary : "+t.getSalary());
		System.out.println("Employee Joining Year : "+t.getYear());
		System.out.println("Employee Insurance Number : "+t.getInsurance());
	}
}