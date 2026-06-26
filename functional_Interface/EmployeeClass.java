package functional_Interface;

public class EmployeeClass {
	static int call(int a) {
		System.out.println(1000);
		return a;
	}
	
	public static void main(String[] args) {
		/*    ::--> is method reference operator
		 * 
		 *  
		 * 	  here using the class name we call the static methods 
		 * 	  and that static method will contains some statements 
		 *    to achieve this we need to have the same return type
		 *    and formal arguments also if it is same then the statements 
		 *    in the static method will be overridden to the abstract
		 *    method 
		 *    
		 *    
		 *    ----->EmployeeInterFace has one abstract method:
		 *    int Salary(int a);
		 *    
		 *    ----->call() has the same signature:
		 *    static int call(int a)
		 *    
		 *    ----->So the method reference binds Salary() to call().
		 *    ----->Internally It is equivalent to:
		 *    
		 *    EmployeeInterFace e = (a) -> EmployeeClass.call(a);
		 *    */
		
		EmployeeInterFace e= EmployeeClass :: call;
		int a=e.Salary(9);
		int b =0;
		b+=a;
		System.out.println(b);
	}
}
