package kodlamaIO.dataAccess.Concrete.jdbc;

import java.util.ArrayList;

import kodlamaIO.dataAccess.Abstract.IInstructorDao;
import kodlamaIO.entities.Concrete.Instructor;

public class JdbcInstructorDao implements IInstructorDao{

ArrayList<Instructor> instructors;
	
	public JdbcInstructorDao() {
		ArrayList<Instructor> instructors=new ArrayList<>();
		instructors.add(new Instructor(1,"Engin","Demiroğ",null));
		instructors.add(new Instructor(2,"Derin","Demiroğ",null));
		instructors.add(new Instructor(3,"Salih","Demiroğ",null));
		this.instructors = instructors;
	}
	@Override
	public void add(Instructor instructor) {
		System.out.println("Jdbc ile "+instructor.getInstructorFirstName()+" "+
	instructor.getInstructorLastName()+" isimli egitmen eklendi");
		instructors.add(instructor);
	}
	@Override
	public ArrayList<Instructor> GetAll() {
		return this.instructors;
	}

}
