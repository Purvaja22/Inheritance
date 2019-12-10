class Person
{
	String name = "Purvaja";
	void display()
	{
		System.out.println("Name : "+name);
	}	
}

class Student extends Person
{
	int id = 30251;
	void display()
	{	
		super.display();
		System.out.println("ID : "+id);
	}
}

class Teacher extends Person
{
	double salary = 45000;
	String subject = "OOP concept in Java";
	void display()
	{
		super.display();
		System.out.println("Salary : "+salary);
		System.out.println("Subject : "+subject);
	}
}

class collegeStudent extends Student
{
	int year = 2;
	String group = "CSE";
	void display()
	{
		super.display();
		System.out.println("Year : "+year);
		System.out.println("Group : "+group);
	}
}

class E42
{
	public static void main(String args[])
	{
		collegeStudent c = new collegeStudent();
		c.display();
		Teacher t = new Teacher();
		t.display();
	}
}


