package Bank_account_task;
import java.util.*;

enum AccountType {
    SAVINGS,CURRENT
}
interface AccountInfoDisplay {
    void displayAccountInfo();
}

class BankAccount implements AccountInfoDisplay{
    private final String accountHoldername;
    private final int accountNumber;
    private final AccountType accountType;
    double balance;
    private final ArrayList<String> transactions;

    BankAccount(String accountHoldername, int accountNumber, AccountType accountType, double balance) {
        this.accountHoldername = accountHoldername;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
        this.transactions = new ArrayList<>(); // Initialize transaction history
        transactions.add("Account created with balance:" + balance);
    }
    public void deposit(double amount){
        if(amount>0 ){
            balance+=amount;
            System.out.println("Deposited amount:"+amount);
            System.out.println("Balance after deposit:"+balance);
            transactions.add("Deposited" + amount + "New Balance is:" + balance);
        }
        else{
            System.out.println("Invalid deposit");

        }
    }
    public void withdraw(double amount){
        if(amount>0 && amount<balance){
            balance-=amount;
            System.out.println("withdrawn amount:"+amount);
            System.out.println("Balance after withdraw:"+balance);
            transactions.add("Withdrawn" + amount + "New Balance is:" + balance);
        }
        else{
            System.out.println("Insufficient balance");
        }
    }
    public void displayAccountInfo(){
        System.out.println("Account Holder: " +accountHoldername);
        System.out.println("Account Number: " +accountNumber);
        System.out.println("Account Type: " +accountType);
        System.out.println("Balance:" + balance);
    }
    public int getAccountNumber(){
        return accountNumber;
    }
    public double getbalance(){
        return balance;
    }

    public void displayTransactionHistory() {
        System.out.println("\nTransaction History for Account " + accountNumber +" ");
        if (transactions.isEmpty()) {
            System.out.println("No transactions found.");
        } else {
            for (String transaction : transactions) {
                System.out.println(transaction);
            }
        }
    }
}

    public class Bank_application {
        static Scanner sc = new Scanner(System.in);
        static ArrayList<BankAccount> bankAccounts = new ArrayList<>();

        public static void main(String[] args) {
            while (true) {
                System.out.println("1.Create Account");
                System.out.println("2.Deposit Money");
                System.out.println("3.Withdraw Money");
                System.out.println("4.Check Balance");
                System.out.println("5.View All Accounts");
                System.out.println("6. View Transaction History");
                System.out.println("7.Exit");
                System.out.println("Enter your Choice:");

                int choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        createAccount();
                        break;
                    case 2:
                        depositMoney();
                        break;
                    case 3:
                        withdrawMoney();
                        break;
                    case 4:
                        checkBalance();
                        break;
                    case 5:
                        displayAllAccounts();
                        break;
                    case 6:
                        viewTransactionHistory();
                        break;

                    case 7:
                        System.out.println("Exit");
                        return;
                    default:
                        System.out.println("Invalid input");
                }


            }

        }

        private static void createAccount() {
            System.out.println("Enter Account holder name:");
            sc.nextLine();
            //System.out.println("Enter Account holder name:");
            String name = sc.nextLine();
            System.out.println("Enter Account number:");
            int accountNumber = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter Account type:");
            String accountTypeinput = sc.nextLine().toUpperCase();

            AccountType accountType;

            try {
                accountType = AccountType.valueOf(accountTypeinput);
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid account type");
                // accountType = AccountType.SAVINGS;
                return;
            }
            System.out.println("Enter initial amount:");
            double balance = sc.nextDouble();
            BankAccount newAccount = new BankAccount(name, accountNumber, accountType, balance);
            bankAccounts.add(newAccount);

        }

        private static void depositMoney() {
            System.out.println("Enter account number:");
            int accountnumber = sc.nextInt();
            BankAccount account = findAccount(accountnumber);
            if (account != null) {
                System.out.println("Enter deposit amount:");
                double amount = sc.nextDouble();
                account.deposit(amount);
            }
        }

        private static void withdrawMoney() {
            System.out.println("Enter account number:");
            int accountNumber=sc.nextInt();
            BankAccount account=findAccount(accountNumber);
            if(account!=null){
                System.out.println("Enter amount to withdraw");
                double amount=sc.nextDouble();
                account.withdraw(amount);
            }
            else{
                System.out.println("Account not found");
            }

        }

        private static void checkBalance() {
            System.out.println("Enter account number:");
            int accountNumber=sc.nextInt();

            BankAccount account=findAccount(accountNumber);
            if(account!=null){
                System.out.println("Your Account Balance is"+account.getbalance());
            }
            else{
                System.out.println("Account not found");
            }

        }

        private static void displayAllAccounts() {
            if (bankAccounts.isEmpty()) {
                System.out.println("No Accounts Found!");
                return;
            }
            System.out.println("ALL ACCOUNTS ");
            for (BankAccount account : bankAccounts) {
                account.displayAccountInfo();
            }

        }
       private static void viewTransactionHistory() {
            System.out.print("Enter Account Number: ");
            int accountNumber = sc.nextInt();
            BankAccount account = findAccount(accountNumber);
            if (account != null) {
                account.displayTransactionHistory();
            } else {
                System.out.println("Account not found!");
            }
        }

        private static BankAccount findAccount(int accountNumber) {
            for (BankAccount account : bankAccounts) {
                if (account.getAccountNumber() == (accountNumber)) {
                    return account;
                }
            }
            return null;
        }
    }

