package kodlamaIO.business.Abstract;

import java.util.ArrayList;

import kodlamaIO.entities.Concrete.Instructor;

public interface IInstructorService {
	ArrayList<Instructor> GetAll();
	void add(Instructor instructor) throws Exception;
}
