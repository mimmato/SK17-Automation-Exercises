package lesson11.exercise3;

import lesson11.exercise3.Appliance;
import lesson11.exercise3.Refrigerator;
import lesson11.exercise3.WashingMachine;

public class l11_e3_Main {

    public static void main(String[] args) {

        System.out.println("--------------");

        WashingMachine washingMachine = new WashingMachine("LG", "1.02(kWh)", "Washing Machine", true,"white", 5 );

        washingMachine.printApplianceInfo();
        washingMachine.turnOn();
        washingMachine.washingCycle();
        washingMachine.turnOff();
        washingMachine.washingCycle();
        System.out.println("--------------");

        Refrigerator refrigerator = new Refrigerator("Mraz", "8.02(kWh)", "Refrigerator", true);
        refrigerator.setTemperature();
        refrigerator.printApplianceInfo();

        System.out.println("--------------");
        washingMachine.resetSpecificAppliance();
        washingMachine.printApplianceInfo();

        System.out.println("--------------");
        refrigerator.resetSpecificAppliance();
        refrigerator.printApplianceInfo();



    }
}
