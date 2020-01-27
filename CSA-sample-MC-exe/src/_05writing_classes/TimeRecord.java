package _05writing_classes;

public class TimeRecord
{
private int hours;
private int minutes; //0,5minutes,60
public TimeRecord(int h, int m)
 {
hours = h;
minutes = m;
 }
/** @return the number of hours */ 
public int getHours()
{ /* implementation not shown */ } 

/** @return the number of minutes
* Postcondition: 0 ≤ minutes < 60 */ 
public int getMinutes()
{ /* implementation not shown */ } 

/** Adds h hours and m minutes to this TimeRecord
*@param  h the number of hours 
*	Precondition: h ≥ 0
*@param m the number of minutes
*	Precondition: m ≥ 0 
*/

public void advance(int h, int m) 
{ 
hours = hours + h; 
minutes = minutes + m; 
/* missing code */ } 
}
// ... other methods not shown } 
/*Consider the following declaration that appears in a client program.*/
TimeRecord[] timeCards 5 new TimeRecord[100]; 

/*Assume that timeCards has been initialized with TimeRecord objects. Consider the following code segment that is intended to compute the total of all the times stored in timeCards. */

TimeRecord total = new TimeRecord(0,0); 
for (int k = 0; k < timeCards.length; k++) { 
/* missing expression */ ; 
} 

//Which of the following can be used to replace
// /* missing expression */ so that the code segment will work as intended?
/*
(a) timeCards[k].advance() 
(b) total += timeCards[k].advance() 
(c) total.advance(timeCards[k].hours, 
	timeCards[k].minutes) 
(d) total.advance(timeCards[k].getHours(), 
	timeCards[k].getMinutes()) 
(e) timeCards[k].advance(timeCards[k].getHours(), 
	timeCards[k].getMinutes()) 
*/
