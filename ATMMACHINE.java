import java.util.*;
class ATM{
    float Balance;
    int Pin = 5674;
    public void checkpin(){
        System.out.println("Enter Your Pin:-");
        Scanner sc = new Scanner(System.in);
        int eneterdpin = sc.nextInt();
        if(eneterdpin==Pin){
            menu();
        }
        else{
            System.out.println("Enter a valid Pin:-");
        }
    }
    public void menu(){
        System.out.println("Enter Your Choice:-");
        System.out.println("1. Check A/C Balance");
        System.out.println("2.Withdraw Money");
        System.out.println("3.Deposit Money");
        System.out.println("4. EXIT");
        Scanner sc = new Scanner(System.in); 
        int opt =sc.nextInt();
        if(opt == 1){
            checkbalance();
        }
        else if(opt == 2){
            withdrawmoney();
        }
        else if(opt == 3){
            depositmoney();
        }
        else if(opt == 4){
            return;
        }
        else{
            System.out.println("Enter a Valid Choice:-");
        }

    }
    public void checkbalance(){
        System.out.println("Balance:" + Balance);
        menu();
    }
    public void withdrawmoney(){
        System.out.println("Enter Amount to Withdraw:-");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        if (amount > Balance){
            System.out.println("Insufficient Balance.");
        }
        else{
            Balance = Balance-amount;
            System.out.println("Money Withdrawl Successful.");
        }
        menu();
    }
    public void depositmoney(){
        System.out.println("Enter The Amount");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        Balance = Balance + amount;
        System.out.println("Money Deposited Sucessfully");
        menu();

    }
}
public class ATMMACHINE{
    public static void main(String[] args) {
        ATM obj = new ATM();
        obj.checkpin();
    }
}