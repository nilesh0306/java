import java.util.Scanner;
public class Test_amstg_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("enter number");
		int num=sc.nextInt();
		int sum,r;
		int temp;;
		sum=0;
		temp=num;
		while(num>0)  
		{ 
			r=num%10;       
			sum=sum+(r*r*r);    
			num=num/10; 
		}
		System.out.println(sum);
		System.out.println(temp);
			if(temp==sum) {
				System.out.println("enter number is amstrong number" );
			}
			else {
				System.out.println("not a amstrong number");
			}
			
		
		sc.close();
	}

}
         // logic problem Write a program to check entered number is Armstrong number or not.