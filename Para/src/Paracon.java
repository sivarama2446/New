
public class Paracon {

	public Paracon (int a)
	{
		System.out.println("I am constructor" +a);
		
	}
	
	void add()
	
	{
		System.out.println("add");
		
	}
	
	public static void main(String [] arg)
	{
		Paracon s= new Paracon (10);
		s.add();
	}
	
}
