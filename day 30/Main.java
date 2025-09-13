package com.joysistvi.abstractionactivity.day28;

public class Main {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount("202400522", "Lawrence", 1000.0, 4.5);
        CheckingAccount checking = new CheckingAccount("202602313", "Apphia", 200.0, 1000.0);

        savings.displayAccountInfo();
        savings.deposit(200);
        savings.withdraw(500);
       

        System.out.println();

        checking.displayAccountInfo();
        checking.deposit(100);
        checking.withdraw(950);
    }
}
