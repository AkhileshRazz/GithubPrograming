package string;

public class B011_SeperateEachWordWithoutSplitMethod {

	public static void main(String[] args) 
	{
	 String str="In The Box";
	 for (int i = 0; i < str.length(); i++) {
		 if(str.charAt(i) !=' ') {
			 System.out.print(str.charAt(i));
		 }else {
			 System.out.println();
		 }
		
	}

	}

}
