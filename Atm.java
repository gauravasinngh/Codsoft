import java.util.Scanner;
public class Atm {
    public static void displayBalance(int balance){
        System.out.println("current balance :"+balance);
        System.out.println("minimum balance should be maintained in your account");
        System.out.println();
    }
    public static int amountwithdrawing(int balance,int withdrawamount)
    {
        System.out.println("withdrawn status");
        System.out.println("withdrawing Amount :"+ withdrawamount);
        if(balance>=withdrawamount)
        {
            balance=balance-withdrawamount;
            System.out.println("please collect your money and collect the card");
            displayBalance(balance);
        }
        else{
            System.out.println("sorry insufficient balance");
            System.out.println();
        }
        return balance;
    }
    public static int amountDepositing(int balance,int depositAmount)
    {
        System.out.println("deposit status");
        System.out.println("depositing amount:"+ depositAmount);
        balance=balance+depositAmount;
        System.out.println("your money has suceesfully deposited in your account");
        System.out.println("your deposited Amount will be shown on the screen");
        displayBalance(balance);
        return balance;
    }
    public static void main (String args[])
    {
        int balance=15000;
        int withdrawAmount=2000;
        int depositAmount=600;
        displayBalance(balance);
        balance=amountwithdrawing(balance,withdrawAmount);
        balance=amountDepositing(balance,depositAmount);
        System.out.println("thank you");
        System.out.println("have a nice day");
    }

    }

    

