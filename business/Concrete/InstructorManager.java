package kodlamaIO.business.Concrete;

import java.util.ArrayList;

import kodlamaIO.business.Abstract.IInstructorService;
import kodlamaIO.core.logging.Abstract.ILogger;
import kodlamaIO.dataAccess.Abstract.IInstructorDao;
import kodlamaIO.entities.Concrete.Instructor;

public class InstructorManager implements IInstructorService{
	
	private IInstructorDao instructorDao;
	private ILogger[] loggers;
	public InstructorManager(IInstructorDao instructorDao, ILogger[] loggers) {
		this.instructorDao = instructorDao;
		this.loggers = loggers;
	}

	@Override
	public void add(Instructor instructor) throws Exception {
		this.instructorDao.add(instructor);
		
	}
	
	@Override
	public ArrayList<Instructor> GetAll() {
		return this.instructorDao.GetAll();
	}
}
