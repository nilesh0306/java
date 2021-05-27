import java.util.Scanner;
public class Test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i,c=0;
		Scanner sc= new Scanner(System.in);
		n = sc.nextInt();
	
	
	
	for(i=2;i<n;i++)
	{
		if(n%i==0) {
			c=c+1;
		}
	}	
		if(c>=1)
		System.out.println("not a prime no.");
		else
			System.out.println("prime no.");
		}

}