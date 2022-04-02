package Arraysss;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

class Maxnumber
{
	int max()
	{
			int arr[] = {10, 324, 45, 90, 9808};
	        int i;
	        int max =0;
	        for (i = 1; i < arr.length; i++)
	        {
	            if (arr[i] > max)
	            {
	                max = arr[i];
	            }
	        }
	        return max;
}	
	}
public class List2 
{
	public static void main(String[] args) 
	{
		//Difference between finding Min and Max in Array and ArrayList:
		//ARRAY:
		      Maxnumber num = new Maxnumber();
		      System.out.println(num.max());
		      
// ------------------------------------------------------------------------------
		      
		 //ARRAYLIST:
		      ArrayList number = new ArrayList();
		      number.add(1);
		      number.add(34);
		      number.add(56);
		      number.add(77);
		      number.add(12);
		      number.add(34);
		      System.out.println(Collections.max(number));
		      
		 }
}
