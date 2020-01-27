package _07arraylist;

public class q1 {
	/*
	Consider the following code segment.
	*/
	
	ArrayList<String> list 5 new ArrayList<String>();
	
	list.add("P"); 
	list.add("Q"); 
	list.add("R"); 
	list.set(2, "s"); 
	list.add(2, "T"); 
	list.add("u"); 
	System.out.println(list);
	
	/*
	What is printed as a result of executing the code segment? 
	(a) [P, Q, R, s, T]
	(b) [P, Q, s, T, u]
	(c) [P, Q, T, s, u]
	(d) [P, T, Q, s, u] 
	(e) [P, T, s, R, u]
	*/
}
