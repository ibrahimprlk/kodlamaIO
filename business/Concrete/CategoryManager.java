package kodlamaIO.business.Concrete;

import java.util.ArrayList;

import kodlamaIO.business.Abstract.ICategoryService;
import kodlamaIO.core.logging.Abstract.ILogger;
import kodlamaIO.dataAccess.Abstract.ICategoryDao;
import kodlamaIO.entities.Concrete.Category;

public class CategoryManager implements ICategoryService{
	
	private ICategoryDao categoryDao;
	private ILogger[] loggers;
	
	public CategoryManager(ICategoryDao categoryDao,ILogger[] loggers) {
		this.categoryDao=categoryDao;
		this.loggers=loggers;
	}
	
	@Override
	public void add(Category category) throws Exception {
		ArrayList<Category> liste=this.categoryDao.GetAll();
		for(Category x:liste) {
			if(x.getCategoryName()==category.getCategoryName()) {
				throw new Exception("Bu isimde categori var");
			}
		}
		this.categoryDao.add(category);
		for(ILogger logger:loggers) {
			logger.log(category.getCategoryName());
		}
	}

	@Override
	public ArrayList<Category> GetAll() {
		// TODO Auto-generated method stub
		return this.categoryDao.GetAll();
	}

}
