package string;

public class B002_CheckGivenNumberIsPalindrom {

	public static void main(String[] args) {
		int number=12321;
		int num=number;
		int rev=0;
		while(num>0)
		{
			rev=rev*10+num%10;
			
			num=num/10;
			
			
		}
		if(number==rev) {
		System.out.println("palindrom");
			
		}else {
			System.out.println("not palindrom");
		}

	}

}
