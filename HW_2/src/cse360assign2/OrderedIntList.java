/** Description of OrderedIntList
 *	This is a class used for sorting 
 * 	from small to large
 * @author Jiamin Peng
 * @course CSE360
 * @date 5/31/2016
 * @assignment_2
 */

package cse360assign2;

public class OrderedIntList 
{
	protected int[] myArray;  
	protected int count; 
	final protected int ARRAY_SIZE = 10;
	protected boolean debug = false;
	
	/** Constructor
	 * set myArray as an integer array has
	 * 10 elements
	 */
	public OrderedIntList ()
	{
		myArray = new int[ARRAY_SIZE];
	}
	
	/** 
	 * insert method
	 * sort the array with the new element
	 * @param variable
	 * @return	no return
	 */
	public void insert (int variable) 
	{
		if(count == myArray.length) 
			grow();
		
		if(count == 0)
		{
			myArray[0]= variable;
			count++;
		}
		
		else 
		{
			int variableLocation = 0;
			int index = 0;
			boolean done = false;
			while(!done && index < count)
			{
				if(variable < myArray[index]) 
					done = true;
				else
				{
					index++;
					variableLocation++;
				}
					
			}
			
			for (int myIndex = count; myIndex > variableLocation; myIndex--) 
				myArray[myIndex] = myArray[myIndex-1];
			
			myArray[variableLocation] = variable; 
			count++;
		}
		
		if(debug)
		{
			System.out.println();
			System.out.println("Debug- ");
			System.out.println("The insert variable is: " + variable);
			System.out.println("After insertion, the list is: ");
			for(int index = 0; index < myArray.length; index++)
			{
				System.out.print(myArray[index] + "\t");
			}
		}
	}
	
	/** grow method
	 * double the array size if needed
	 * @param 	no parameter
	 * @return	no return value
	 */
	private void grow()
	{
		int []terminal = new int[count * 2];
		
		for (int index = 0; index < count; index++ )
			terminal[index] = myArray[index];
		
		myArray=terminal;
		if(debug)
		{
			System.out.println();
			System.out.println("Debug- After growth, the array size is: " + myArray.length);
		}
	}
	
	/** 
	 * print method
	 * print out the array
	 * @param 	no parameter
	 * @return	no return value
	 */
	public void print () 
	{
		for (int index = 0; index < count; index++) 
		{
			if (index % 5 == 0) 
				System.out.println();
			System.out.print(myArray[index] + "\t");	
		}
		
		System.out.println();
		if(debug)
		{
			System.out.println("Debug- " + "Print well.");
		}
	}
}
