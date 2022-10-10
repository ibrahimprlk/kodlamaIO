package kodlamaIO.core.logging.Concrete;

import kodlamaIO.core.logging.Abstract.ILogger;

public class DatabaseLogger implements ILogger{

	@Override
	public void log(String data) {
		System.out.println("Veritabani ile loglandi : "+data);
	}

}
