package series.com;

public class fibonaaciseries {
	public static void main(String[] args) {
		int n=10;
		int num1=0;
		int num2=1;
		System.out.println("Fibonacci Series till " + n + " terms:");
		for(int i=1;i<=n;i++)
		{
			System.out.print(num1+ ", ");
			int num3=num1+num2;
			num1=num2;
			num2=num3;
		}
		
	}

}
