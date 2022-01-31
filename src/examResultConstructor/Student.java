package examResultConstructor;

public class Student {
	String studentName;
	String subject1;
	String subject2;
	String subject3;
	String subject4;
	int subject1Marks;
	int subject2Marks;
	int subject3Marks;
	int subject4Marks;
	String coursePassed;
	int totalPercentage;

	public Student(String studentName, String subject1, String subject2, String subject3, String subject4,
			int subject1Marks, int subject2Marks, int subject3Marks, int subject4Marks) {
		this.studentName = studentName;
		this.subject1 = subject1;
		this.subject2 = subject2;
		this.subject3 = subject3;
		this.subject4 = subject4;
		this.subject1Marks = subject1Marks;
		this.subject2Marks = subject2Marks;
		this.subject3Marks = subject3Marks;
		this.subject4Marks = subject4Marks;

	}

	int calculatepercentage() {
		totalPercentage = ((subject1Marks + subject2Marks + subject3Marks + subject4Marks)* 100)/400;
		//int sum=subject1Marks + subject2Marks + subject3Marks + subject4Marks;
		
		return totalPercentage;
	}

	String newCourseRequested(String newcourserequested) {

		if (newcourserequested.equals("yes") && (totalPercentage >= 75)) {
			System.out.println("Congratulation! You have passed the course with:" + totalPercentage + "%");
			// return true;
		} else {
			System.out.println("Unfortunatly, Your have less than 75%. You cannot take next course");
			return null;
		}

		return newcourserequested;
	}

}
