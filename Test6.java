import java.util.Scanner;
public class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("pleae enter  number");
		int a= sc.nextInt();
		int fact=1;
		for(int i=1;i<=a;i++)
				fact*=i;
		System.out.println("factorial of nymber is="+fact);
		
		sc.close();
	}

}
