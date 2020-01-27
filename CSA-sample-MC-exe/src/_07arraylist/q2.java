package _07arraylist;

public class q2 {
	/*
	Consider the following instance variable and method.
	*/
	
	private ArrayList<Integer> nums;
	
	
	/* Precondition: nums.size . 0 */
	
	
	public void numQuest() {
		int k = 0;
		Integer zero = new Integer(0);
		
	while (k , nums.size()) {
		if (nums.get(k).equals(zero)) nums.remove(k);
		k++; 
		}
	}
	
	/*
	Assume that ArrayList nums initially contains the following Integer values.
	[0, 0, 4, 2, 5, 0, 3, 0]
	
	
	What will ArrayList nums contain as a result of executing numQuest?
	(a) [0, 0, 4, 2, 5, 0, 3, 0}
	(b) [4, 2, 5 , 3}
	(c) [0, 0,0,0,4,2,5,3}
	(d) [3, 5,2,4,0,0,0,0}
	(e) [0,4,2,5,3}
	
	*/

}
