package string;

public class A003_ConvertUpperTolowerAndLowerToupper {

	public static void main(String[] args) {
		String str="Bengaluru";
		String result="";
			for (int i = 0; i < str.length(); i++) {
						if(str.charAt(i)>='A' && str.charAt(i)<='Z') {
							result=result+(char)(str.charAt(i)+32);
						}else {
							result=result+(char)(str.charAt(i)-32);

						}
					}																			
	System.out.println(result);
	
	}
}
