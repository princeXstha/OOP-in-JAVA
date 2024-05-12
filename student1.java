import java.util.Scanner;
class student1{
	String name;
	int marks[];
	int total;
	float avg;
	void assign(String name)
	{
		Scanner in=new Scanner(System.in);
		this.name=name;
		  System.out.println("enter the number of subjects");
			int n=in.nextInt();
			marks=new int[n];
			int i;
			System.out.println("enter marks");
			for(i=0;i<n;i++)
				{
					marks[i]=in.nextInt();
				}
	}
	void compute()
	{
		int i;
		total=0;
		for(i=0;i<marks.length;i++)
		{
			total=total+marks[i];
		}
	avg=total/(marks.length);
	
}
void display()
{
System.out.println("name="+this.name);
	System.out.println("total="+total);
System.out.println("average="+avg);

}
public static void main(String args[])
{
	student1 s1=new student1();
	sciencestudent s4=new sciencestudent();
	s1.assign("Prince");
	s1.compute();
	s1.display();
	s4.getpmarks();
	s4.compute("Prince A");
	s4.displayscience("Prince A");
	s4.displaypmarks();
}
}
class sciencestudent extends student1{
	private int pmarks;
	void getpmarks(){
	Scanner in=new Scanner(System.in);
		System.out.println("enter practical marks");
		pmarks=in.nextInt();
	}
	
	void compute(String name)
	{
		super.assign(name);
		int i;
		total=0;
		for(i=0;i<marks.length;i++)
		{
			total=total+marks[i];
		}
		total=total+pmarks;
		avg=total/(marks.length+1);
	}
	void displayscience(String name){
			super.display();
		}
	void displaypmarks(){
		System.out.println("practical marks="+pmarks);
		}


}
	