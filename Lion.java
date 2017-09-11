import java.awt.Color;

public class Lion extends Cat
{
	private Color mane;
	
	public Color getManeColor()
	{
		return mane;
	}
	
	public Color setManeColor(Color newColor)
	{
		mane = newColor;
		return mane;
	}
	
	public void roar()
	{
		System.out.println(getName() + " just roared!");
	}
}