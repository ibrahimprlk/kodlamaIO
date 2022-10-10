package kodlamaIO.entities.Concrete;

import kodlamaIO.entities.Abstract.IEntity;

public class Course implements IEntity{
	private int courseId;
	private String courseName;
	private int categoryId;
	private int price;
	private Instructor instructor;
	
	public Course() {

	}

	public Course(int courseId, String courseName, int categoryId,int price, Instructor instructor) {
		this.courseId = courseId;
		this.courseName = courseName;
		this.categoryId=categoryId;
		this.price=price;
		this.instructor = instructor;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public Instructor getInstructor() {
		return instructor;
	}

	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}
