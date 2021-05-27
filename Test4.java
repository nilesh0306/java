import java.util.Scanner;
public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b;
		long result= 1;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a base number");
		a= sc.nextInt();
		System.out.println("enter a power number");
		b= sc.nextInt();
		
		while(b!=0)
		{
		result=result*a;
		b--;
		}
		System.out.println("result="+result);
			
		
		sc.close();
	}

}
