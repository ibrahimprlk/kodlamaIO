package kodlamaIO.business.Concrete;

import java.util.ArrayList;

import kodlamaIO.business.Abstract.ICourseService;
import kodlamaIO.core.logging.Abstract.ILogger;
import kodlamaIO.dataAccess.Abstract.ICourseDao;
import kodlamaIO.entities.Concrete.Course;

public class CourseManager implements ICourseService{

	private ICourseDao courseDao;
	private ILogger[] loggers;
	public CourseManager(ICourseDao courseDao,ILogger[] loggers) {
		this.courseDao=courseDao;
		this.loggers=loggers;
	}
	
	@Override
	public void add(Course course) throws Exception {
		ArrayList<Course> courses=this.courseDao.GetAll();
		for(Course x:courses) {
			if(x.getCourseName()==course.getCourseName()) {
				throw new Exception("Ayni isimde kurs olamaz");
			}
		}
		if(course.getPrice()<=0) {
			throw new Exception("Kurs fiyati 0 dan kucuk olamaz");
		}
		for(ILogger logger:loggers) {
			logger.log(course.getCourseName());
		}
		this.courseDao.add(course);
	}
	
	@Override
	public ArrayList<Course> GetAll() {
		return this.courseDao.GetAll();
	}

}
