//Question: Write a program to reverse the array?//
//Answer://
class Reversearray 
{
	public static void main(String[] args) 
	{
		int []B = new int [] {100,200,300,400,500,600,700,800,900,1000};

		System.out.println("Original Array:");
		for(int i=0;i<B.length;i++)
		{
			System.out.println(B[i]+"");
	}
	System.out.println();
	System.out.println("Array is reverse order:");
	for(int i=B.length-1;i>=0;i--)
		{
		System.out.print(B[i]+" ");
		}
	}
}
