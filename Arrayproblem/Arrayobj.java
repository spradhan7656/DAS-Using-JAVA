class Student
{
	int roll;
	String name;
	int mark;
}

class Arrayobj
{
	public static void main(String [] args)
	{
		Student s1=new Student();
		s1.roll=1;s1.name="Santosh";s1.mark=90;
		Student s2=new Student();
		s2.roll=2;s2.name="Rahul";s2.mark=91;
		Student s3=new Student();
		s3.roll=3;s3.name="Pravin";s3.mark=93;

		Student a[]=new Student[3];

		a[0]=s1;a[1]=s2;a[2]=s3;

		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i].name+" : "+a[i].roll+" : "+a[i].mark);
		}
	}
}