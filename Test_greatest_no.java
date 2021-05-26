import java.util.Scanner;
public class Test_greatest_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a first number");
		int a=sc.nextInt();
		System.out.println("enter a second number");
		int b=sc.nextInt();
		System.out.println("enter a third number");
		int c=sc.nextInt();
sc.close();
if(a>b && a>c) {

		System.out.println("greatest number is="+a);
}
else if(b>a && b>c)
		System.out.println("greatest number is="+c);
	
		else
			System.out.println("greatest number is="+c);
}

	}


