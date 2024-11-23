package string;

public class B009_EachWordFromstring {
public static void main(String[] args) {
	String str="In The Box";
	String[] st = str.split(" ");
	
	for (int i = 0; i < st.length; i++) {
		
		System.out.println(st[i]);
		
	}
}
}
