import java.util.Scanner;
public class Palindrome_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp, r,sum;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		temp=n;
		sum=0;
		while(n>0)  
		{ 
			r=n%10;     //3    //5  1
			sum=(sum*10)+r;    
			n=n/10; 
		}
			if(temp==sum) {
				System.out.println("enter number is palendome number" );
			}
			else {
				System.out.println("not a pelindrome number");
			}
			
		
		sc.close();
		
		
	}

}