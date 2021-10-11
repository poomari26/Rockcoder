import java.util.Scanner;

class Pattern4
{
	public static void main(String[] args) 
	{
		Scanner Scanner = new Scanner(System.in);

		System.out.println("Numbers of rows you want in this pattern?!");
		int rows = Scanner.nextInt();
	
		for(int i=1; i<=rows;i++)
		{
			for(int j=rows;j>=i;j--)
			{
				System.out.print(j+"");
			}
			System.out.println();
		}
	}
}
