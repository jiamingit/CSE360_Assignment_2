/** Description of TestAnalytics
 *	The class must contain a main method and 
 *	adequately test all methods in Analytics, 
 *	both local and inherited.
 *
 * @author Jiamin Peng
 * @course CSE360
 * @date 5/31/2016
 * @assignment_2
 */

import java.util.Random;
import cse360assign2.Analytics;

public class TestAnalytics {

	public static void main(String[] args) 
	{
		System.out.println("Change");
		//set a test array of size 20
		//randomly get number from 0 to 50
		Analytics myTest = new Analytics();
		int[] test = new int[20];
		
		for(int index = 0; index < test.length; index++)
		{
			Random rnd = new Random();
			test[index] = rnd.nextInt(51);
		}
		
		//test when list is empty, please common the code above
		//and uncommon the next two lines
		//Analytics myTest = new Analytics();
		//int test[] = {};
		
		//test inherited method insert and growth
		//Because the test array size is larger than 10.
		//It will call the growth function
		for(int i = 0; i < test.length; i++)
		{
			myTest.insert(test[i]);
		}
		
		System.out.println();
		System.out.println("After sorted from small to large. the list is:");
		//test inherited method print 
		myTest.print();
		//test local method mean
		System.out.println("The mean value of this list is: " + myTest.mean());
		//test local method median
		System.out.println("The median value of this list is: " + myTest.median());
		//test local method high
		System.out.println("The high value of this list is: " + myTest.high());
		//test local method low
		System.out.println("The low value of this list is: " + myTest.low());
		//test local method numInts
		System.out.println("The size of this list is: " + myTest.numInts());
	}

}
