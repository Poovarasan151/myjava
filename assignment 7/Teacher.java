package org.may;

public class Teacher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		School teacher = new School();
		teacher.conduct_exams();
		teacher.publish_results(75);
		System.out.println(teacher.mark);
		System.out.println(teacher.school_name);
	}
	
	

}
