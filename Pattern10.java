class  Patteren10
{
	public static void main(String[] args) 
	{
		int a=0;
			for(int i=a;i>=0;i--)
			{   
				int x=a-i;
			for(int j=((a-i)+1);j<=a;j++)
				{
					System.out.print((j+x) + " ");
					x++;
					System.out.print("0");
				}
				
				System.out.println("");
			}
			
	}
}
