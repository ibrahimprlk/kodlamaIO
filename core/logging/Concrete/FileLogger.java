package kodlamaIO.core.logging.Concrete;

import kodlamaIO.core.logging.Abstract.ILogger;

public class FileLogger implements ILogger{

	@Override
	public void log(String data) {
		System.out.println("Dosyaya loglandi : "+data);
	}

}
