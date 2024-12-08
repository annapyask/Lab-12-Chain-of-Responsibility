package ucu.edu.ua.apps;

import ucu.edu.ua.apps.task1.ATM;

public class Main {
    public static void main(String[] args) {
        ATM atm = new ATM();
        atm.GetMeMoney(1000);
        atm.GetMeMoney(700);
        atm.GetMeMoney(800);
    }
}