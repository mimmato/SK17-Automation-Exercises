package lesson11.exercise4;

public class l11_e4_Main {

    public static void main(String[] args) {

//        System.out.println("--------------");
//
//        WashingMachine washingMachine = new WashingMachine("LG", "1.02(kWh)", "Washing Machine", true,"white", 5 );
//
//        washingMachine.printApplianceInfo();
//        washingMachine.turnOn();
//        washingMachine.washingCycle();
//        washingMachine.turnOff();
//        washingMachine.washingCycle();
//        System.out.println("--------------");
//
//        Refrigerator refrigerator = new Refrigerator("Mraz", "8.02(kWh)", "Refrigerator", true);
//        refrigerator.setTemperature();
//        refrigerator.printApplianceInfo();
//
//        System.out.println("--------------");
//        washingMachine.resetSpecificAppliance();
//        washingMachine.printApplianceInfo();
//
//        System.out.println("--------------");
//        refrigerator.resetSpecificAppliance();
//        refrigerator.printApplianceInfo();

        Microwave microwave = new Microwave("Samsung", "1.01(kWh)", "Microwave", true, 100, 0);
//        microwave.setTemperature();
        microwave.setCapacity();
        microwave.startHeating();
        microwave.printApplianceInfo();
        microwave.resetSpecificAppliance();
        microwave.printApplianceInfo();
    }
}
