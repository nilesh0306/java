import java.util.Scanner;
public class Test_reverse_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter number");
int num=sc.nextInt();
int rem, reverse=0;
while(num!=0)
{
	rem= num%10;
	reverse= reverse*10+rem;
	num = num/10;
}

System.out.println("reverse value is="+reverse);


sc.close();
	}

}
