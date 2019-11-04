import java.util.Scanner;
class Employee
{  
    int salary ;
	int nbrofhour;
	public void getinfo(int salary, int nbrofhour)
	{
		this.salary=salary;
		this.nbrofhour=nbrofhour;
	}
	public void addsalary()
	{
		if(salary>=500)
		{
			salary+=10;
		}
	}
	public void  adddworkhourbonus()
	{
		if(nbrofhour>5)
		{
			salary+=5;
		}
	}
	public void totalsalary()
	{
		System.out.println("Your Total Salary is "+salary);
	}
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		 Employee emp= new Employee();
		 System.out.println("Enter Your Salary:");
		 int salary=sc.nextInt();
		 System.out.println("Enter Your Work hours per Day:");
		 int nbrofhour= sc.nextInt();
		 emp.getinfo(salary,nbrofhour);
		 emp.addsalary();
		 emp.adddworkhourbonus();
		 emp.totalsalary();
	}
	
}