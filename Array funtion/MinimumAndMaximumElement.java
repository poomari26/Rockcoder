//Question 1:Find the minimum and maximum element in an array?//
//AAnswer://
class MinimumAndMaximumElement
{
	public static void main(String[] args) 
	{
		int A[] = {5,8,67,987,786,2334};
		int max = A[0];
		int min = A[0];
		for(int i=1;i<A.length;i++)
		{
			if(A[i]>max)
			{
				max = A[i];
	}
}
System.out.println("The minimum array element is"+" "+min);
System.out.println("The maximum array element is"+" "+max);
	}
}