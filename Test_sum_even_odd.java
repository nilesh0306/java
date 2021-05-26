import java.util.Scanner;
public class Test_sum_even_odd {

	public static void main(String[] args) 
	{
	
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Please enter a number : ");
		int n=sc.nextInt();
		
		int evensum=0,oddsum=0;
		for(int i=1;i<=n;i++)
			if(i%2==0)
				evensum+=i;
			else
				oddsum+=i;
		System.out.print("Addition of even numbers : "+evensum);
		System.out.println();
		System.out.print("Addition of odd numbers "+oddsum);
		sc.close();
	}}