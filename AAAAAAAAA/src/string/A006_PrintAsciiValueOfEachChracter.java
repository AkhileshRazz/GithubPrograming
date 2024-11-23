package string;

public class A006_PrintAsciiValueOfEachChracter {
	public static void main(String[] args) {
		String str="Bengaluru";
		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i)+"----> "+(int)str.charAt(i));
		}
	}

}
