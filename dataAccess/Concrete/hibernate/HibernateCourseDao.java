package kodlamaIO.dataAccess.Concrete.hibernate;

import java.util.ArrayList;

import kodlamaIO.dataAccess.Abstract.ICourseDao;
import kodlamaIO.entities.Concrete.Course;
import kodlamaIO.entities.Concrete.Instructor;

public class HibernateCourseDao implements ICourseDao{

	ArrayList<Course> courses;
	public HibernateCourseDao(){
		ArrayList<Course> courses=new ArrayList<Course>();
		courses.add(new Course(1,"Java",1,400,new Instructor(1,"Engin","Demiroğ",null)));
		courses.add(new Course(2,"Intro to Operating System ",1,700,new Instructor(2,"Levent","Bayındır",null)));
		courses.add(new Course(3,"Machine Learning",4,800,new Instructor(1,"Mete","Yaganoglu",null)));
		this.courses=courses;
	}
	
	@Override
	public void add(Course course) {
		courses.add(course);
		System.out.println("Hibernate ile "+course.getCourseName()+" isimli kurs eklendi");
	}

	@Override
	public ArrayList<Course> GetAll() {
		return this.courses;
	}

}
