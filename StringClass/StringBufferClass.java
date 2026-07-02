package StringClass;

public class StringBufferClass {
	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("Magesh");
		StringBuffer sb3=sb;
		System.out.println(sb);
//		sb.append(" k b");
//		System.out.println(sb);
		System.out.println(sb.capacity());
		StringBuffer sb1=new StringBuffer("Magesh");
		System.out.println(sb1);
		System.out.println(sb==sb1);
		System.out.println(sb1.equals(sb));
		System.out.println(sb==sb3);
		System.out.println(sb.equals(sb3));
		System.out.println(sb.hashCode());
		System.out.println(sb1.hashCode());
		System.out.println(sb3.hashCode());
		
		
		System.out.println(sb.toString().equals(sb1.toString()));
	}

}
