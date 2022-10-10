package kodlamaIO.business.Abstract;

import java.util.ArrayList;

import kodlamaIO.entities.Concrete.Category;

public interface ICategoryService {
	ArrayList<Category> GetAll();
	void add(Category category) throws Exception;
}
