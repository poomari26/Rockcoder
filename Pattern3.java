import java.util.Scanner;

class Pattern3 
{
	public static void main(String[] args) 
	{
		Scanner Scanner = new Scanner(System.in);

		System.out.println("Number of the number");
		int rows = Scanner.nextInt();
		for(int i =1;i<=rows;i++)
		{
			for(int j=i;j<=rows;j++)
			{
				System.out.print(j+"");
	}
System.out.println();
}
	}
}