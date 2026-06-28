package comparable;



public class Student implements Comparable{
	
	
	int rollno;
	String name;
	
	
	public Student(int rollno, String name) {
		super();
		this.rollno = rollno;
		this.name = name;
	}


	@Override
	public int compareTo(Object o) {
		Student obj=(Student)o;
		if(this.rollno==obj.rollno) {
			return 0;
		}
		if(this.rollno>obj.rollno) {
			return this.rollno-obj.rollno;
		}
		return this.rollno-obj.rollno;
	}


	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + "]";
	}
	
	

}
