package com.company;

public class M_3_4 {

    static Bank bank;

    public static void main(String[] args){

        bank = new Bank();
    }

}
class Bank{
    int amount = 100;

    Bank(){
        new Client1().start();
        new Client2().start();
    }

    synchronized void operate(int i){
        amount += i;
        System.out.println(amount);
    }

}
class Client1 extends Thread{
    @Override
    public void run() {
        while (true) {
            M_3_4.bank.operate(-1);
            M_3_4.bank.operate(1);
        }
    }
}
class Client2 extends Thread{
    @Override
    public void run() {
        while (true) {
            M_3_4.bank.operate(1);
            M_3_4.bank.operate(-1);
        }
    }
}

