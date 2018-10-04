package ie.gmit.studentmanager;

public class StudentManager {  //SET AN INITIAL CAPACITY
	private static final int INTIAL CAPACITY = 10;
	private Student[] students = null; //This creates an array to store student objects



public StudentManager () {
		students = new Student[INTIAL CAPACITY];
}

//CREATE METHODS YOU MAY NEED AND STUB THEM OUT

public boolean add(Student student) {
	return false;
}

public boolean delete(String studentId) {
	return false;
}

public Student[] getStudnetsByFistName(String firstName) {
	return null;
}
public int findTotalStudents() {
	return -1;
}
}