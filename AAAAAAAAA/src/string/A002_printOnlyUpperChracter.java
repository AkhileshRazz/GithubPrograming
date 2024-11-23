package string;

public class A002_printOnlyUpperChracter {

	
	public static void main(String[] args) {
		String str ="Bengaluru";
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i)>='A' && str.charAt(i)<='Z')
			{
				System.out.println(str.charAt(i));
			}
		}
	}
}
