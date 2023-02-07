package week1.day2;

public class A2_IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=13;
		boolean flag = false;
		
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				flag=true;
				break;
			}
		}
		
		if(flag) {
	
			System.out.println("given number is not a prime");
		}
		else
		{
		System.out.println("given number is a prime");
		}

	}
}
