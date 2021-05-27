import java.util.Scanner;
public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2;
		int	Result;
		char x, y;
	//	String add;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a 1st number");
		num1= sc.nextInt();
		System.out.println("enter a 2st number");
		num2= sc.nextInt();
		Result= num1+num2;
		System.out.println("rdesult="+Result);
		
		System.out.println("enter a character1");
		x=  sc.next().charAt(0);
		System.out.println("enter a character2");
		y= sc.next().charAt(0);
		
		//add= ;
		System.out.println("add="+x+y+"");
		
		sc.close();
	}
	
	
	

}
