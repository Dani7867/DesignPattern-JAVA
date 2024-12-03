package behavioral.template;
import java.util.Date;

public abstract class ConnectionTemplate {
	
	private boolean isLoggingEnable = true;

	public ConnectionTemplate() {
		isLoggingEnable = disableLogging();
	}
	
	public final void run() {
		setDBDriver();
		logging("Drivers set [" + new Date() + "]");
		setCredentials();
		logging("Credentails set [" + new Date() + "]");
		connect();
		logging("Conencted");
		prepareStatement();
		setData();
		insert();
		close();
		destroy();
		}
	
	public abstract void setDBDriver();
	
	public abstract void setCredentials();
	
	public abstract void setData();
	
	public void connect() {
		System.out.println("Setting connection...");
	}
	
	public void prepareStatement() {
		System.out.println("Preparing insert statement...");
	}
	
	
	public void insert() {
		System.out.println("Inserting data...");
	}
	
	public void close() {
		System.out.println("Closing connections...");
	}
		
	public void destroy() {
		System.out.println("Destroying connection objects...\n");
	}
	
	public boolean disableLogging() {
		return true;
	}
	
	private void logging(String msg) {
		if (isLoggingEnable) {
			System.out.println("Logging....: " + msg);
		}
	}
}
