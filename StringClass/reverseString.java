package StringClass;

public class reverseString {

	public static void main(String[] args) {
		String str="'Hello,World!'";
		String rev=ReverseString(str);
		System.out.println("Reverse of the string is :"+rev);

	}

	private static String ReverseString(String str) {
		String res="";
		for(int i=str.length()-1;i>=0;i--) {
			res+=str.charAt(i);
		}
		return res;
		
		
//		StringBuilder rev=new StringBuilder();
//		
//		for(int i=0;i<str.length();i++) {
//			rev=rev.append(str.charAt(i));
//		}
//		rev=rev.reverse();
//		return rev.toString();
	}

}
