import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        System.out.println("How Many Record do you want to Add ? :-> ");
//        int n=sc.nextInt();
//        for(int i=1;i<=n;i++) {
            System.out.println("Enter Name :-> ");
            String name = sc.nextLine();

            System.out.println("Enter password :-> ");
            String password = sc.nextLine();

            System.out.println("Enter Balance :-> ");
            int balance = sc.nextInt();

            SBIAccount meetAcc = new SBIAccount(name, balance, password);
            System.out.println("Account Created :-> " + meetAcc.getAccountNo());

            //getbalance
            System.out.println("Current Balance :-> " + meetAcc.getBalance());

            //deposit
            System.out.println("Enter Amount to deposit :-> ");
            int depositRupee = sc.nextInt();
            meetAcc.depositMoney(depositRupee);
            System.out.println("New balance is :-> " + meetAcc.getBalance());

            //withdraw
            System.out.println("Enter amount to withdraw :->");
            int amount = sc.nextInt();
            System.out.println("Enter Password :-> ");
            String enterPassword = sc.next();
            System.out.println(meetAcc.withdraw(amount, enterPassword));

            //interest
            System.out.println("Interest on current 4 years balance " + meetAcc.getBalance() + " is " + meetAcc.calculateInterest(4));


    }
}