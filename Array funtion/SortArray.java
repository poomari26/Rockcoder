//Question :Write a program to sort the given array?//
//Answer://
import java.util.Arrays;
public class SortArray
{

	public static void main(String[] args) 
	{

		int [] array = new int[] {45,6,89,-3,1,245,2346,67,778,989,790,801,5};
		Arrays.sort(array);
        System.out.println("Element of array sorted in ascending order:");
		for(int i=0;i<array.length;i++)
		{
			System.out.println(array[i]);
	}
}
}