package kodlamaIO.dataAccess.Abstract;

import java.util.ArrayList;

import kodlamaIO.entities.Concrete.Course;

public interface ICourseDao {
	void add(Course course);
	ArrayList<Course> GetAll();
}
