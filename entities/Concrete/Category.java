package kodlamaIO.entities.Concrete;

import kodlamaIO.entities.Abstract.IEntity;

public class Category implements IEntity {
	private int categoryId;
	private String categoryName;

	public Category() {

	}

	public Category(int categoryId, String categoryName) {
		this.categoryId = categoryId;
		this.categoryName = categoryName;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
}
