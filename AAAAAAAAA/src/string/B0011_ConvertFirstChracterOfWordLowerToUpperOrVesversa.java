package string;

public class B0011_ConvertFirstChracterOfWordLowerToUpperOrVesversa {

	public static void main(String[] args) {
		String str="in the Box ";
		String[] st = str.split(" ");
		for (int i = 0; i < st.length; i++) {
			if(st[i].charAt(0)>='A' && st[i].charAt(0)<='Z') {
				st[i]=(char)(st[i].charAt(0)+32)+st[i].substring(1);
			}else {
			
				st[i]=(char)(st[i].charAt(0)-32)+st[i].substring(1);
			}
			
			System.out.println(st[i]);
		}

	}

}
