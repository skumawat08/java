package school;

public class Example
{
	public static void main(String[] args)
	{
		Student s1=new Student();
		s1.setName("john");
		s1.setAge(19);
		s1.setRoll(55);
		System.out.println("Name="+s1.getName());
		System.out.println("Age="+s1.getAge());
		System.out.println("Roll="+s1.getRoll());
	}
}