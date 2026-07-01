package exception;

public class UnCheckedException {
	public static void main(String[] args) {
		System.out.println("start");
		
		
		
		
		//DIVISION BY ZERO
//		System.out.println(8/0);
		try{
			int a=10/0;
			System.out.println(a);
		}
		catch(Exception e) {
//			e.printStackTrace();
			System.out.println(e);
		}
//		System.out.println(a);
		
		
		
		
		
		
		
		
		//NULL POINTER EXCEPTION
		try {
			String str=null;
			
			System.out.println(str.length());
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		
		
		
		
		//ARRAY INDEX OUTOF BOUNDS
		try {
			int arr[]=new int[3];
			System.out.println(arr[-2]);
		}
		catch(Throwable e) {
//			System.out.println(e);
			String message=e.getMessage();
			System.err.println(message);
		}
		
		
		
		
		
		//NESTED TRY CATCH 
//		try {
//			int a=10;
//			try {
//				int b=10/0;
//			}
//			catch(Exception e){
//				System.out.println(e);
//				System.out.println("catch inner");
//				try {
//					String str=null;
//					System.out.println(str.length());
//				}
//				catch(Exception ex) {
//					System.out.println(ex);
//					System.out.println("catch inner inner");
//				}
//			}
//			
//		}
//		catch(Exception e) {
//			System.out.println("catch main");
//		}
//		
		
		
		
		System.out.println("end");
		
		
		
	}

}
