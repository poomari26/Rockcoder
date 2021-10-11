import java.util.Scanner;

class  Pattern8
{
	public static void main(String[] args) 
	{
		Scanner Scanner = new Scanner(System.in);
		System.out.println("Enter the number");
		int rows = Scanner.nextInt();
		{  
		
			for(int i=1;i<=rows;i++)
			{
			for(int j=i;j<=rows;j++)
				{
					System.out.print(i+"");
				}
				System.out.println();
			}
	}
}
}