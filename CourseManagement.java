import java.util.Scanner;
class Course
{
	 String course[] = {"JAVA","Web Designing","Selenium","Python","PHP"};
	 int courseid[] = {111,222,333,444,555};
	 int days[]  = {30, 50, 20, 40, 25};
	 int fees[] = {50000, 35000, 20000, 45000, 15000};
	 void displayCourses()
	 {
		 	System.out.println("Courses Offered:");
			for(String c : course)
			{
				System.out.println(c);
			}
	 }
}
class Student
{
	String studentName;
	String courseName;
	String date;
	Course courseObj;
	Student(String studentName, String courseName, String date, Course courseObj)
	{
		this.studentName = studentName;
		this.courseName = courseName;
		this.date = date;
		this.courseObj = courseObj;
	}
	Student(){}
	void displayStudentDetails()
	{
		courseObj.displayCourses();
		System.out.println("Details:");
		System.out.println("Student Name:"+studentName);
		System.out.println("Course Enquired:"+courseName);
		for(int i=0;i<courseObj.course.length;i++)
		{
			if (courseName.equals(courseObj.course[i]))
			{
				System.out.println("Training Days:"+courseObj.days[i]);
				System.out.println("Fees:"+courseObj.fees[i]);
			}
		}
		System.out.println("Joining date:"+date);
	}
}
public class CourseManagement {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Course courseObj = new Course();
		courseObj.displayCourses();
		System.out.println("Enter your name:");
		String studName = s.next();
		System.out.println("Enter the course you need:");
		String course = s.next();
		System.out.println("Enter the joining date:");
		String joiningDate = s.next();
		Student stud = new Student(studName,course,joiningDate,courseObj);
		stud.displayStudentDetails();
	}

}

