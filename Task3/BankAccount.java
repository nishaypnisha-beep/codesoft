class BankAccount
{
    private double balance;
    public BankAccount(double balance)
    {
        this.balance = balance;
    }
    public void deposit(double amount)
    {
        if (amount > 0)
        {
            balance += amount;
            System.out.println("Amount deposited successfully.");
        }
        else
        {
            System.out.println("Invalid deposit amount.");
        }
    }
    public void withdraw(double amount)
    {
        if (amount > 0 && amount <= balance)
        {
            balance -= amount;
            System.out.println("Withdrawal completed successfully.");
        }
        else
        {
            System.out.println("Transaction failed: Insufficient balance or invalid amount.");
        }
    }
    public void checkBalance()
    {
        System.out.println("Current Account Balance: " + balance);
    }
}
