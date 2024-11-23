package string;

public class A005_printVowelOnly {
	public static void main(String[] args) {
		String str ="BengaluruA";
		String st=str.toLowerCase();
		for (int i = 0; i < str.length(); i++) {
			if(st.charAt(i)=='a'||st.charAt(i)=='e'||st.charAt(i)=='i'||st.charAt(i)=='o'||st.charAt(i)=='u') {
				System.out.println(str.charAt(i));
			}
		}
	}

}
