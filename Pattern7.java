import java.util.Scanner;

class  Pattern7
{
	public static void main(String[] args) 
	{
		Scanner Scanner = new Scanner(System.in);
		System.out.println("Enter the number");
		int rows = Scanner.nextInt();
		{
		
			for(int i=rows;i>=1;i--)
			{
				for(int j=rows;j>=i;j--)
				{
					System.out.print(j+"");
				}
				System.out.println();
			}
	}
}
}