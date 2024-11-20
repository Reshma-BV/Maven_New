package aggregation;

public class Student_Details
{
	String name;
	int age;
	int id;
	Student student;
	Student_Details(String name,int age,int id,Student student)
	{
		this.name=name;
		this.age=age;
		this.id=id;
		this.student=student;
	}
	public void display()
	{
		System.out.println(student.schoolname);
		System.out.println(name+" "+age+" "+id);
	}
	public static void main(String[] args) 
	{
		Student stuobj=new Student("Carpenters");
		Student_Details studentdetails=new Student_Details("Nivaan",4,8,stuobj);
		studentdetails.display();
	}

}
