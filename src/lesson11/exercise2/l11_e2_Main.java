package lesson11.exercise2;

public class l11_e2_Main {

    public static void main(String[] args) {

        System.out.println("--------------");

        WashingMachine washingMachine = new WashingMachine("LG", "1.02(kWh)", "Washing Machine", "white", "large" );

        washingMachine.printApplianceInfo();
        washingMachine.turnOn();
        washingMachine.washingCycle();
        washingMachine.turnOff();
        washingMachine.washingCycle();


    }
}
