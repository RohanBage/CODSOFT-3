package Projects;
import java.util.*;

class Main {
    Scanner sc = new Scanner(System.in);
    int PIN = 3465;
    float Balance;

    void checkpin(){
        int n=1;
        while(n<=3){
            System.out.println("Enter PIN : ");
            int EnterdPin=sc.nextInt();
            if(EnterdPin==PIN){
                menu();
            }
            else{
                System.out.println("Incorrect PIN !!! "+(3-n)+" Attempt remaining");
                if(n==3){
                    System.out.println("Access Blocked ");
                }
                n++;
            }

        }
    }
    void menu(){
        int ch;
        do{
            System.out.println("Welcome to ATM Machine\n 1.Deposit Money\n 2.Withdraw Money\n 3.Check Balance\n 4.Exit\n");
            ch=sc.nextInt();
            switch(ch){
                case 1:DepositeMoney();
                    break;
                case 2:WithdrawMoney();
                    break;
                case 3:CheckBalance();
                    break;
                case 4:break;
                default:System.out.println("Enter valid choice ");
            }
        }
        while(ch!=4);
    }
    void DepositeMoney(){
        System.out.println("Enter Amount to Deposite");
        float amount = sc.nextFloat();
        Balance = Balance+amount;
        System.out.println("Amount Deposited Succesfully ");
    }
    void WithdrawMoney(){
        System.out.println("Enter Amount to Withdraw ");
        float amount = sc.nextFloat();
        if(amount>Balance){
            System.out.println("Insufficient Balance ");
        }
        else if (amount<Balance) {
            Balance=Balance-amount;
            System.out.println("Amount Withdrawed Succesfully ");
        }
    }
    void CheckBalance(){
        System.out.println("Balance is : "+Balance);
    }
}
public class ATM {
    public static void main(String[] args) {
        Main obj = new Main();
        obj.checkpin();
    }
}
