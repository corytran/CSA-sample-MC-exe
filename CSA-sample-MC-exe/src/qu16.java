
public class qu16 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value = mystery(5);
		System.out.print(value);
	}
	
	public static int mystery(int n)
	{
		if (n == 0)
			return 1;
		else
			return 3 * mystery(n - 1);
	}
	
}
