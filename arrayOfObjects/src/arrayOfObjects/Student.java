package arrayOfObjects;

import java.util.Scanner;

public class Student {
	private int id;
	private String name;
	private int rank;

	Student(int id, String name, int rank) {
		this.id = id;
		this.name = name;
		this.rank = rank;
	}

	public String toString() {
		return ("Student id=" + this.id + "Student name=" + this.name + "Student rank" + this.rank);
	}
	public static void main(String[] args) {
		int n, i, id, rank;
		String name;
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("enter no.of Students");
			n = scan.nextInt();
			Student s[] = new Student[n];
			for (i = 0; i < n; i++) {
				System.out.println("enter student id");
				id = scan.nextInt();
				System.out.println("enter the name");
				name = scan.next();
				System.out.println("enter the rank");
				rank = scan.nextInt();
				s[i] = new Student(id, name, rank);
				}
			for (i = 0; i < n; i++)
				System.out.println(s[i]);
		} 
	}
}