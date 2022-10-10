package kodlamaIO.dataAccess.Concrete.hibernate;

import java.util.ArrayList;

import kodlamaIO.dataAccess.Abstract.IInstructorDao;
import kodlamaIO.entities.Concrete.Instructor;

public class HibernateInstructorDao implements IInstructorDao{
	
	ArrayList<Instructor> instructors;
	
	public HibernateInstructorDao() {
		ArrayList<Instructor> instructors=new ArrayList<>();
		instructors.add(new Instructor(1,"Engin","Demiroğ",null));
		instructors.add(new Instructor(2,"Derin","Demiroğ",null));
		instructors.add(new Instructor(3,"Salih","Demiroğ",null));
		this.instructors = instructors;
	}

	@Override
	public void add(Instructor instructor) {
		System.out.println("Hibernate ile "+instructor.getInstructorFirstName()+" "+
	instructor.getInstructorLastName()+" isimli egitmen eklendi");
		this.instructors.add(instructor);
	}

	@Override
	public ArrayList<Instructor> GetAll() {
		return this.instructors;
	}

}
