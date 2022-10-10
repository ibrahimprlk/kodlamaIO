package kodlamaIO.dataAccess.Abstract;
import java.util.ArrayList;

import kodlamaIO.entities.Concrete.Category;

public interface ICategoryDao {
	void add(Category category);
	ArrayList<Category> GetAll();
}
