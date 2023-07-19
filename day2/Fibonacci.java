package week1.day2;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=8;
		int f1=0;
		int f2=1;
		int sum;
		System.out.println(f1);
		System.out.println(f2);
		for(int i=1;i<count;i++) 
		{sum=f1+f2;    
		  System.out.print(" "+sum);    
		  f1=f2;    
		  f2=sum;    

		
		}
		

	}

}
