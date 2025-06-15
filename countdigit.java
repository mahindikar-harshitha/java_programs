package series.com;

public class countdigit {
	public static void main(String[] args) {
		int num=12345;
		int count = 0;
		while(num!=0)
		{
			num/=10;
			count++;	
		}
		System.out.println("digit count in the input is " + count);
	}

}
