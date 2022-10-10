package kodlamaIO.dataAccess.Abstract;

import java.util.ArrayList;

import kodlamaIO.entities.Concrete.Instructor;

public interface IInstructorDao {
	void add(Instructor instructor);
	ArrayList<Instructor> GetAll();
}
