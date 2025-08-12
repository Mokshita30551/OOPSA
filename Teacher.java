package Teacher;
import java.util.Scanner;
public class Teacher{
	static int counter=1;
	int id;
	String name;
	String subject;
	public Teacher(String name, String subject) {
		this.id=counter++;
		this.name=name;
		this.subject=subject;
		displaydetails();
	}
	public void displaydetails()
	{
		System.out.println("Teacher id: "+id);
		System.out.println("Name: "+name);
		System.out.println("Subject: "+subject);
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of teachers:");
		int n=sc.nextInt();
		sc.nextLine();
		Teacher[] teacher = new Teacher[n];
		for (int i=0;i<n;i++)
		{
			System.out.println("Enter details for teacher " + (i + 1) + ":");
	        System.out.print("Name: ");
	        String name = sc.nextLine();
	        System.out.print("Subject: ");
	        String subject = sc.nextLine();

	        teacher[i] = new Teacher(name, subject);
		}
	 sc.close();

	}
	}