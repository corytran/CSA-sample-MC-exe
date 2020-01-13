
public class qu18 {
	
	private static String s = "world";
	private static int n = 6;
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		changer(s, n);
	}
	
	public static void changer(String x, int y)
	{
		x = x + "peace";
		y = y * 2;
		
		System.out.println(x);
		System.out.println(y);
	}
	
}
