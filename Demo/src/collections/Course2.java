package collections;

public class Course2 implements Comparable<Course2>{
	public int courseId;
	public String courseName;
	
	public Course2(int courseId,String courseName) {
		this.courseId = courseId;
		this.courseName = courseName;
	}
	
	// need to sort as Collection will not sort user define objects
	public int compareTo(Course2 otherCourse) {
		return this.courseName.compareTo(otherCourse.courseName);
	}
	
	public String toString() {
		return this.courseId+":"+this.courseName;
	}
}
