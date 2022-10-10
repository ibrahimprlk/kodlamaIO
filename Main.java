package kodlamaIO;

import java.util.ArrayList;

import kodlamaIO.business.Concrete.CategoryManager;
import kodlamaIO.business.Concrete.CourseManager;
import kodlamaIO.business.Concrete.InstructorManager;
import kodlamaIO.core.logging.Abstract.ILogger;
import kodlamaIO.core.logging.Concrete.DatabaseLogger;
import kodlamaIO.core.logging.Concrete.FileLogger;
import kodlamaIO.core.logging.Concrete.MailLogger;
import kodlamaIO.dataAccess.Concrete.hibernate.HibernateCategoryDao;
import kodlamaIO.dataAccess.Concrete.hibernate.HibernateCourseDao;
import kodlamaIO.dataAccess.Concrete.hibernate.HibernateInstructorDao;
import kodlamaIO.dataAccess.Concrete.jdbc.JdbcCategoryDao;
import kodlamaIO.entities.Concrete.Category;
import kodlamaIO.entities.Concrete.Course;
import kodlamaIO.entities.Concrete.Instructor;


public class Main {

	public static void main(String[] args) throws Exception {
		ILogger[] loggers= {new DatabaseLogger(),new MailLogger(),new FileLogger()};
		
		InstructorManager instructorManager=new InstructorManager(new HibernateInstructorDao(), loggers);
		
		for(Instructor instructor:instructorManager.GetAll()) {
			System.out.println(instructor.getInstructorId()+" "+instructor.getInstructorFirstName()
			+" "+instructor.getInstructorLastName());
		}
		//courseTest(loggers);
		//categoryTest(loggers);
	}

	private static void courseTest(ILogger[] loggers) throws Exception {
		CourseManager courseManager=new CourseManager(new HibernateCourseDao(), loggers);
		
		Instructor instructor=new Instructor(1, "Ferhat", "Bozkurt", null);
		Course course1=new Course(4,"Java2",1,1000,instructor);
		courseManager.add(course1);
		
		for(Course course:courseManager.GetAll()) {
			System.out.println(course.getCourseId()+" - categoryId: "+course.getCategoryId()+" - "+
					course.getCourseName()+" - "+course.getPrice()+"Lira  - "+course.getInstructor().getInstructorFirstName()
					+" - "+course.getInstructor().getInstructorLastName());
		}
	}

	private static void categoryTest(ILogger[] loggers) throws Exception {
		CategoryManager categoryManager=new CategoryManager(new HibernateCategoryDao(), loggers);
		
		Category category=new Category(4,"Yapay Zeka");
		categoryManager.add(category);
		
		ArrayList<Category> categories=categoryManager.GetAll();
		for(Category category2:categories) {
			System.out.println(category2.getCategoryId()+" "+category2.getCategoryName());
		}
	}

}
