package Exeptions;

public class Demo {
	public static void main(String[] args) {
		int divisor = 1;
		int data = 0;
		try {
				data = 100/divisor;
				System.out.println("data is "+data);
				/*
				 * String s=null; System.out.println(s.length());//NullPointerException
				 */

				/*
				 * String s="abc"; int i=Integer.parseInt(s);
				 */

				int a[]=new int[5];  
				a[10]=50; 
			data = 100/divisor;
			System.out.println("data is "+data);
			String s = null;
			System.out.println(s.length());
			}catch(Exception e) {
				e.printStackTrace();
				//increment the divisor and check
				divisor++;
				data = 100/divisor;
				System.out.println("data is "+data);
			}
		System.out.println("6 million lines of code");
	}

}
