import java.util.Scanner;
class ATM
{
    private BankAccount account;
    private Scanner sc = new Scanner(System.in);
    public ATM(BankAccount account)
    {
        this.account = account;
    }
    public void start()
    {
        int choice;
        do
        {
            System.out.println("\n================ ATM MENU ================");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.println("==========================================");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice)
            {
                case 1:
                    account.checkBalance();
                    break;

                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = sc.nextDouble();
                    account.deposit(depositAmount);
                    break;

                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = sc.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;

                case 4:
                    System.out.println("Thank you for using the ATM system.");
                    break;

                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }

        }
        while (choice != 4);
    }
}
