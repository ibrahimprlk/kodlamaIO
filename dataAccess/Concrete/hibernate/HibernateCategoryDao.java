package kodlamaIO.dataAccess.Concrete.hibernate;

import java.util.ArrayList;
import java.util.List;

import kodlamaIO.dataAccess.Abstract.ICategoryDao;
import kodlamaIO.entities.Concrete.Category;

public class HibernateCategoryDao implements ICategoryDao{
	
	List<Category> categories;
	public HibernateCategoryDao() {
		ArrayList<Category> categories = new ArrayList<>();
		categories.add(new Category(1,"Programlama"));
		categories.add(new Category(2,"Isletim Sistemi"));
		categories.add(new Category(3,"Siber Guvenlik"));
		this.categories=categories;
	}
	
	@Override
	public void add(Category category) {
		System.out.println("Hibernate ile "+category.getCategoryName()+"isimli category eklendi");
		this.categories.add(category);
	}

	@Override
	public ArrayList<Category> GetAll() {
		return (ArrayList<Category>) this.categories;
	}
	

}
