package string;

public class A004_PrintDigitLetterspecialChracterSeperate {

	public static void main(String[] args) {
		String str="Abc@123#";
		String digit="";
		String letter="";
		String spec="";
		for (int i = 0; i < str.length(); i++) {
			if((str.charAt(i)>='A' && str.charAt(i)<='Z') || (str.charAt(i)>='a' && str.charAt(i)<='z')) {
				letter +=str.charAt(i);
			}else if(str.charAt(i)>='0' && str.charAt(i)<='9')
			{
				digit+=str.charAt(i);
			}else {
				spec+=str.charAt(i);
			}
			
		}
		System.out.println(digit);
		System.out.println(letter);
		System.out.println(spec);
	}

}
