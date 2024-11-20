package aggregation;

public class EmployeeDetails 
{
	String name;
	int age;
	Employee employee;
	
	EmployeeDetails (String name,int age, Employee employee)
	{
		this.name=name;
		this.age=age;
		this.employee=employee;
	}
	public void display()
	{
		System.out.println(name+" "+age);
		System.out.println(employee.city+" "+employee.CompanyName);

	}
	public static void main(String[] args) 
	{
		Employee ob=new Employee("London","WebTrends");
		EmployeeDetails obj=new EmployeeDetails("Teena",30,ob);
		obj.display();
		
	}

}
