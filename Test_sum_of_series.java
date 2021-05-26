import java.util.Scanner;
public class Test_sum_of_series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc= new Scanner(System.in);
	System.out.println("enter number");
	int n= sc.nextInt();
	
	int sum=0;
	for(int i=1;i<=n;i++)
		sum+=i;
	System.out.println("sum="+sum);
	
	sc.close();
	
	
	
	}

}
