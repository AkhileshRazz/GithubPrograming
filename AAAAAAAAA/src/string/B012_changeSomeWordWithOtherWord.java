package string;

public class B012_changeSomeWordWithOtherWord 
{
	public static void main(String[] args) {
	String str="In The Box";//Box-->Building
	String[] st = str.split(" ");
	for (int i = 0; i <st.length; i++) {
		if(st[i].equalsIgnoreCase("Box")) {
			st[i]="House";
		}
		System.out.println(st[i]);
	}
	
	}

}
