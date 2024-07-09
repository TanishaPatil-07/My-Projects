import java.util.Scanner;

public class BankingApplication {
    static Scanner sc  = new Scanner(System.in);
    public static double totalDeposits = 1000;
    //:: deposit() ::
    public static void depositMoney(){
        double depositAmt;
        System.out.println("\nEnter the amount your want to deposit (INR): ");
        depositAmt = sc.nextDouble();
        if (depositAmt > 0){
            totalDeposits += depositAmt;
        }
        System.out.println("\nYour total deposit amount is (INR) : "+"Rs. "+depositAmt);
    }


    // :: withdraw() ::
    public static void withdrawMoney(){
        System.out.println("\nEnter the amount to be withdrawn : ");
        double withdrawAmt = sc.nextDouble();
        if (totalDeposits > 1000 && withdrawAmt < totalDeposits) {
            totalDeposits -= withdrawAmt;
            System.out.println("\nSuccessfully withdrawn your desired amount of Rs. "+withdrawAmt);
        }
        else {
            System.out.println("\nSorry, you've reached the minimum balance limit which is Rs.1000\nHence the amount cannot be withdrawn!!");
        }
    }

    // :: checking balance ::
    public static void checkBalance(){
        if (totalDeposits > 0) {
            System.out.println("\nYour current balance is : Rs. "+totalDeposits);
        }
    }



    public static void main(String[] args) {
        int choice = 1;
        System.out.println("Enter your choice : \n1.Check Balance \n2.Deposit Money \n3.Withdraw Money");
        while (choice == 1){
            int userChoice = sc.nextInt();
            switch (userChoice){
                case 1 :
                    checkBalance();
                    break;
                case 2 :
                    depositMoney();
                    break;
                case 3 :
                    withdrawMoney();
                    break;
                default:
                    System.out.println("\nInvalid Operation!");
            }
            System.out.println("\nDo you wanna continue? \n 1.Continue || 0.Exit");
            choice = sc.nextInt();
            if (choice == 1) {
                System.out.println("\nEnter your choice : \n1.Check Balance \n2.Deposit Money \n3.Withdraw Money");
            }
            if (choice == 0){
                System.out.println("Successfully exiting the program\nThank You <`>");
                break;
            }
        }
    }
}
