package kodlamaIO.business.Abstract;

import java.util.ArrayList;

import kodlamaIO.entities.Concrete.Course;

public interface ICourseService {
	ArrayList<Course> GetAll();
	void add(Course course) throws Exception;
}
