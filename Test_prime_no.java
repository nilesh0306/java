import java.util.Scanner;
public class Test_prime_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int n, temp;
	
	Scanner sc=new Scanner(System.in);   //Write a  program to print all Prime numbers between 1 to n
	System.out.println("enter number");
	n=sc.nextInt();//10
	for(int i=2;i<n;i++)
	{
		
		temp=0;
		for(int j=1;j<=i;j++)                      
		{
		   if(i%j==0)
		   {
			temp++;
		    }
		}
		
	if(temp==2) 
	System.out.println(i);
		
	
	}

	sc.close();

}}






	


