/** Description of Analytics
 *	This is a class inherit 
 *	from the OrderedIntList.java class.
 *	It has five functions.
 *	Find the mean, median, high, low, size
 *	of an array.
 * @author Jiamin Peng
 * @course CSE360
 * @date 5/31/2016
 * @assignment_2
 */

package cse360assign2;

public class Analytics extends OrderedIntList 
{
	/** Constructor
	 * empty. Do nothing
	 */
	public Analytics()
	{
	}
	
	/** 
	 * Method mean 
	 * Find the mean of the integer list as a double
	 * 
	 * @param no parameter
	 * @return	the mean value as double
	 */
	public double mean()
	{
		double mean;
		int sumAll = 0;
		
		if(count == 0)
			return -1;
		else
		{
			mean = myArray[0];
			for(int index = 0; index < myArray.length; index++)
			{
				sumAll += myArray[index];
			}
			mean = (double) sumAll /count; 
			return mean;
		}
			
	}
	
	/** 
	 * Method median
	 * Find the median of the integer list as an integer.
	 * If the size of the list is even,
	 * median is the average of the middle two number.
	 * If the size of the list is odd,
	 * median is the middle number
	 * 
	 * @param no parameter
	 * @return the median value of the list as an integer
	 */
	public int median()
	{
		int median;
		
		if(count == 0)
			return -1;
		else
		{
			if(count % 2 == 0)
			{
				median =(myArray[count / 2] + myArray[count / 2 - 1]) / 2;
				return median;
			}
			else
			{
				median = myArray[count / 2];
				return median;
			}
		}
	
	}
	
	/** 
	 * Method high
	 * Find the max value in the list.
	 * Because the list is sorted, 
	 * the high value is the last one.
	 * 
	 * @param no parameter
	 * @return the max value of the list as an integer
	 */
	public int high()
	{
		if(count == 0)
			return -1;
		else
			return myArray[count - 1];
	}
	
	/** 
	 * Method low
	 * Find the min value of the list
	 * Because the list is sorted,
	 * the min value is the first one.
	 * 
	 * @param no parameter
	 * @return the min value of the list as integer
	 */
	public int low()
	{
		if(count == 0)
			return -1;
		else
			return myArray[0];
	}
	
	/** 
	 * Method numInts
	 * Find the size of the list.
	 * 
	 * @param no parameter
	 * @return the size of the list as an integer
	 */
	public int numInts()
	{
		return count;
	}
}
