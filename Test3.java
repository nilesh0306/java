
public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int p=20000 , t=3, n=12;
		double  r=0.06, amount =p * Math.pow(1 + (r / n), n * t);
		double cinterest = amount - p;
		 System.out.println("Compound Interest after " + t + " years: "+cinterest);
	        System.out.println("Amount after " + t + " years: "+amount);
		}

	}


