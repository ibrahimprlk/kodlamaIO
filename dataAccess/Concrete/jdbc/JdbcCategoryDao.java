package kodlamaIO.dataAccess.Concrete.jdbc;

import java.util.ArrayList;
import java.util.List;

import kodlamaIO.dataAccess.Abstract.ICategoryDao;
import kodlamaIO.entities.Concrete.Category;

public class JdbcCategoryDao implements ICategoryDao{

	List<Category> categories;
	
	public JdbcCategoryDao() {
		ArrayList<Category> categories = new ArrayList<>();
		categories.add(new Category(1,"Programlama"));
		categories.add(new Category(2,"Isletim Sistemi"));
		categories.add(new Category(3,"Siber Guvenlik"));
		this.categories=categories;
	}
	@Override
	public void add(Category category) {
		System.out.println("Jdbc ile "+category.getCategoryName()+" isimli categori eklendi");
		this.categories.add(category);
	}
	@Override
	public ArrayList<Category> GetAll() {
		// TODO Auto-generated method stub
		return (ArrayList<Category>) this.categories;
	}

}
