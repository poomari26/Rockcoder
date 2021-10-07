//question : Find the factorial number?//
//Answer://
import java.util.Scanner;
class Factorial 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the number:");
		Scanner Scanner = new Scanner(System.in);
		int n=Scanner.nextInt();
		Factorial f=new Factorial();
        int result=f.fact(n);
	System.out.println("factorial of" + n +" is "+result);
	}
	int fact(int a)
	{
		if(a==1)
			return 1;
		else
			return a*fact(a-1);
	}
}
		
	