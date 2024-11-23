package string;

public class B014_ReverseEachWordAndEachCharacterOfWord {

	public static void main(String[] args) {
		String str="In The Box";
		String[] st = str.split(" ");
		String rev="";
		for (int i = st.length-1; i >=0; i--) {
			
			for (int j = st[i].length()-1; j >=0; j--) {
				
				rev=rev+st[i].charAt(j);
			}
			rev=rev+" ";
		}
		System.out.println(rev);
	}

}
