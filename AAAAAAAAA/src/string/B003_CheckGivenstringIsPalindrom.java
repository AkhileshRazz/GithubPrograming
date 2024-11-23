package string;

public class B003_CheckGivenstringIsPalindrom {
	
	
	public static void main(String[] args)
	{
		String str="malayalam";
		String rev="";
		for (int i = str.length()-1; i >=0; i--) 
		{
			rev+=str.charAt(i);
			
			
		}
		if(str.equals(rev)) {
			System.out.println("palindrom");
		}else {
			System.out.println("not palindrom");
		}
	}

}
