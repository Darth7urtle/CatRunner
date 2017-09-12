import java.awt.Color;

public class CatRunner
{
	public static void main(String[] args)
	{
		Cat blake = new Cat("Blakkkke");
		//blake.setName("Blake");
		blake.eat("cat food");
		
		Lion leo = new Lion("leooooo", Color.RED);
		//leo.setName("Leo");
		//leo.setManeColor(Color.YELLOW);
		leo.roar(); 
	}
}