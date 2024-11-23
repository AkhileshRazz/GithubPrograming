package string;

public class B010_LongestWordInTheString {

	public static void main(String[] args) {
		String str="In The Boxx";
		String[] st = str.split(" ");
		String maxlength="";
		for (int i = 0; i < st.length; i++) {
			if(st[i].length()>maxlength.length()) {
				maxlength=st[i];
			}
		}
		
		System.out.println(maxlength);

	}

}
