import java.awt.Color;

public class Lion extends Cat
{
	private Color m;
	
	public Lion(String name, Color mane)
	{
		super(name);
		m = mane;
	}
	public Color getManeColor()
	{
		return m;
	}
	
	public Color setManeColor(Color newColor)
	{
		m = newColor;
		return m;
	}
	
	public void roar()
	{
		System.out.println(getName() + " just roared!");
	}
}