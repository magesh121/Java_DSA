package comparable;

import java.util.Arrays;

public class School {

	public static void main(String[] args) {
		Student s[] = {
				new Student(100,"Akash"),
				new Student(108,"Gayle"),
				new Student(101,"Haswin"),
				new Student(102,"Magesh"),
				new Student(105,"ABD"),
				new Student(103,"Virat")
		};
		System.out.println("========  BEFORE SORTING  ========");
		for(int i=0;i<s.length;i++) {
			System.out.println(s[i]);
		}
		Arrays.sort(s);
		System.out.println("========  AFTER SORTING  ========");
		for(int i=0;i<s.length;i++) {
			System.out.println(s[i]);
		}
	}
}
