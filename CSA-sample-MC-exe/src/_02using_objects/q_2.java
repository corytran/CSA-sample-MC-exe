package _02using_objects;

public class q_2 
{
	/*
	 * Consider the following declarations.
	 *  */
	
	  public interface Comparable
	  {
	    int compareTo(Object other); 
	  
	  }
	  
	 public class SomeClass implements Comparable 
	 {
	    // ... other methods not shown 
	 }
	 /*
	 * 	Which of the following method signatures of compareTo will satisfy the Comparable interface requirement?
	 * III. public int compareTo(Object other)
	 * III. public int compareTo(SomeClass other)
	 * III. public boolean compareTo(Object other)
	 *  
	 * (a) I only
	 * (b) II only
	 * (c) III only
	 * (d) I and II only 
	 * (e) I, II, and III
	 */
	
}
