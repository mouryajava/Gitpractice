package intro.java.demo;

class Computer 
{
	public void playMusic() 
	{
		System.out.println("Music Playing..");
	}
	public String getMeApen(int cost) 
	{
		if(cost>=10)
		return "Pen";
		
			return "Nothing";
	}
	
}

public class MethodsDemo {
	public static void main(String a[]) 
	{
		Computer obj = new Computer();
		obj.playMusic();
String str= obj.getMeApen(9);		
	System.out.println(str);
	}

}
