
public class qu14 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mystery(5);
	}
	
	public static void mystery(int x)
	{
		System.out.print(x % 10);
		if ((x / 10) != 0)
		{
			mystery(x / 10);
		}
		System.out.print(x % 10);
	}
	
}
