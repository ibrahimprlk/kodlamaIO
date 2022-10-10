package kodlamaIO.core.logging.Concrete;

import kodlamaIO.core.logging.Abstract.ILogger;

public class MailLogger implements ILogger{

	@Override
	public void log(String data) {
		System.out.println("Mail ile loglandi : "+data);
	}

}
