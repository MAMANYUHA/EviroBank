package com.eviro.assessment.grad001.adivhahomamanyuha;

import java.util.Scanner;

class CurrentAccount implements AccountServices {
    double balance, withdrawalAmount,Withdrawal;

    CurrentAccount(double balance, double withdrawalAmount, double Withdrawal) {
        this.balance = balance;
        this.withdrawalAmount = withdrawalAmount;
        this.Withdrawal = Withdrawal;
    }
    @Override
    public void withdraw(double balance,
                         double withdrawalAmount, double Withdrawal) {
        this.balance = balance;
        this.withdrawalAmount = withdrawalAmount;
        this.Withdrawal = Withdrawal;
        Scanner kb = new Scanner(System.in);
        System.out.println("*****   Hi, This is CurrentAccount  *****");
        System.out.println("what is you balance?");
        balance = kb.nextDouble();



        withdrawalAmount = balance + 100000;
        System.out.println("Enter the amount that you want to withdraw :");
        double withdrawal = kb.nextDouble();
        if(withdrawal<(balance+100000)){
            System.out.println("You have sucessfully withdrawn  :"+withdrawal);
        }else{
            System.out.println("The maximum amount that you can withdraw is "+ withdrawalAmount);
        }
        
    }

    public static void main(String[] args) {
        double balance,withdrawalAmount;
        CurrentAccount c = new CurrentAccount(1050,0,0);
        c.withdraw(1050,0,0);

        SavingAccount d = new SavingAccount(1050,0);
        d.withdraw(1050,0);
        System.out.println("Thank you for Banking with us");
    }
}

class SavingAccount{
    double balance,withdrawalAmount;

    SavingAccount(double balance, double withdrawalAmount){
        this.balance = balance;
        this.withdrawalAmount = withdrawalAmount;
    }

    public void withdraw(double balance, double withdrawalAmount) {
        Scanner kb = new Scanner(System.in);
        System.out.println("*****   Hi, This is SavingAccount  *****\n");
        System.out.println("Enter your balance :");
        balance = kb.nextDouble();
        System.out.println("how much do you want to withdraw?");
        withdrawalAmount = kb.nextDouble();

        if(balance>1000 && withdrawalAmount<balance && (balance- withdrawalAmount)>=1000){
            System.out.println("You can withdraw from your savingAccount\n");
        }else {
            System.out.println("You cant withdraw from your savingAccount\n");
        }
    }
}







