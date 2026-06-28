package comparable;

import java.util.Comparator;

public class Boys implements Comparable{
	int age;
	String name;
	public Boys(int age, String name) {
		this.age = age;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Boys [age=" + age + ", name=" + name + "]";
	}
	@Override
	public int compareTo(Object o) {
		Boys b=(Boys) o;
		if(this.age<b.age) {
			return -1;
		}
		if(this.age>b.age) {
			return +1;
		}
		return this.name.compareTo(b.name);
	}
	
	

}
