package structural.proxy;

public class Test {
	public static void main(String[] args) {
		RealBankAccount realAccount = new RealBankAccount(1000.0);
		
		BankAccountProxy proxyAccount = new BankAccountProxy(realAccount, "Danish");
		
		System.out.println("Test with authorized user:");
		proxyAccount.deposit("Danish", 500.0);
        proxyAccount.withdraw("Danish", 200.0);
		System.out.println("Final Balance: $" + proxyAccount.getBalance("Danish"));
		
		System.out.println("Test with unauthorized user:");
		proxyAccount.deposit("Unknown", 500.0);
        proxyAccount.withdraw("u", 200.0);
		System.out.println("Final Balance: $" + proxyAccount.getBalance("u"));
		
	}
}
