package examResultConstructor;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student obj1 = new Student("Priyanka singla", "English", "Science", "Math", "Punjabi", 90, 90, 90, 80);
		
		System.out.println("Student Name: " + obj1.studentName + "\n" + "Subjects Taken and Marks Obtained: " + "\n"
				+ obj1.subject1 + "  " + obj1.subject1Marks + "\n" + obj1.subject2 + " " + obj1.subject2Marks + "\n"
				+ obj1.subject3 + "  " + obj1.subject3Marks + "\n" + obj1.subject4 + "  " + obj1.subject4Marks);

		int totalpercentage = obj1.calculatepercentage();
		System.out.println("Total Percentage: " + totalpercentage);
		
		
		System.out.println("Checking if User can take new Course" +"\n"+ obj1.newCourseRequested("yes"));

	}

}
