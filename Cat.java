public class Cat
{
	private String n;
	private int a;
	private String o;
	
	public Cat(String name)
	{
		n = name;
	}
	public String getName()
	{
		return n;
	}

	public String setName(String newName)
	{
		n = newName;
		return n;
	}
	
	public int getAge()
	{
		return a;
	}
	
	public int setAge(int newAge)
	{
		a = newAge;
		return a;
	}
	
	public String getOwner()
	{
		return o;
	}
	
	public String setOwner(String newOwner)
	{
		o = newOwner;
		return o;
	}
	
	public void eat(String food)
	{
		System.out.println(n + " just ate " + food);
	}
}