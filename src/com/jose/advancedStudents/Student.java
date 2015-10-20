package com.jose.advancedStudents;

public class Student {

	private String name;
	private int[] tests;
	
	public Student() {
		this("");
	}
	
	public Student(String nm) {
		this(nm , 3);
	}
	
	public Student(String nm, int n) {
		name = nm;
		tests = new int[n];
		for(int i = 0; i < tests.length; i++) {
			tests[i] = 0;
		}
	}
	
	public Student(String nm, int[] t) {
		name = nm;
		tests = new int[t.length];
		for(int i = 0; i < tests.length; i++) {
			tests[i] = t[i];
		}
	}
	
	public Student(Student s) {
		this(s.name, s.tests);
	}

	public String getName() {
		return name;
	}
	
	public void setName(String nm) {
		name = nm;
	}
	
	public void setScore(int i, int score) {
		tests[i - 1] = score;
	}
	
	public int getScore(int i) {
		return tests[i - 1];
	}
	
	public int getAverage() {
		int sum = 0;
		for(int score : tests) {
			sum += score;
		}
		return sum / tests.length;
	}
	
	
	
	
}
