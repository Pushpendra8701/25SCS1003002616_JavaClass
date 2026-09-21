class BankAccount {

    // Instance variables
    String accountNumber;
    String accountHolderName;
    double balance;

    // Static variable
    static double interestRate = 5.0;

    // Constructor
    BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    // Method to display account details
    void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: ₹" + balance);
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println("----------------------------");
    }

    public static void main(String[] args) {

        // Creating 3 bank accounts
        BankAccount account1 =
                new BankAccount("ACC101", "Rahul", 25000);

        BankAccount account2 =
                new BankAccount("ACC102", "Aman", 40000);

        BankAccount account3 =
                new BankAccount("ACC103", "Priya", 55000);

        // Display details before changing interest rate
        System.out.println("Before Changing Interest Rate:");
        account1.displayDetails();
        account2.displayDetails();
        account3.displayDetails();

        // Changing static interest rate using class name
        BankAccount.interestRate = 6.5;

        // Display details after changing interest rate
        System.out.println("\nAfter Changing Interest Rate:");
        account1.displayDetails();
        account2.displayDetails();
        account3.displayDetails();
    }
}