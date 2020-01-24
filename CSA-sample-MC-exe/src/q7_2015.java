
public class q7_2015 
{
	public static void main(String[] args)
	{
		for(int outer = 1; outer <= 6; outer++)
		{
			for(int inner = outer; inner <= 6; inner++)
			{
				if(inner % 2 == 0)
				{
					System.out.print(inner + " ");
				}
			}
			System.out.println();
		}
	}

}
/* What will be printed as a result of executing the code segment?
 * A) 2 4 6
 * 	  4 6
 *    6
 *    
 * B) 2 4 6
 *    2 4 6
 *    2 4 6
 *    
 * C) 2 4 6
 * 	  2 4 6
 * 	  4 6
 *    4 6
 *    6
 *    6
 *    
 * D) 2 4 6
 * 	  2 4 6   
*/


