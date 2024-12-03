package structural.proxy;

public class BankAccountProxy implements BankAccount {
    private RealBankAccount realBankAccount;
    private String authorizedUser;

    public BankAccountProxy(RealBankAccount realBankAccount, String authorizedUser) {
        this.realBankAccount = realBankAccount;
        this.authorizedUser = authorizedUser;
    }

    private boolean authenticate(String user) {
        return authorizedUser.equals(user);
    }

    @Override
    public void deposit(double amount) {
        throw new UnsupportedOperationException("Authentication required.");
    }

    public void deposit(String user, double amount) {
        if (authenticate(user)) {
            realBankAccount.deposit(amount);
        } else {
            System.out.println("Access denied: Unauthorized user.");
        }
    }


@Override
public void withdraw(double amount) {
    throw new UnsupportedOperationException("Authentication required.");
}

public void withdraw(String user, double amount) {
    if (authenticate(user)) {
        realBankAccount.withdraw(amount);
    } else {
        System.out.println("Access denied: Unauthorized user.");
    }
}

@Override
public double getBalance() {
    throw new UnsupportedOperationException("Authentication required.");
}

public double getBalance(String user) {
    if (authenticate(user)) {
        return realBankAccount.getBalance();
    } else {
        System.out.println("Access denied: Unauthorized user.");
        return -1; // Indicate access denial
    }
}
}
