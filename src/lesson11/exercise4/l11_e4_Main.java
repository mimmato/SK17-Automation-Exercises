package lesson11.exercise4;

public class l11_e4_Main {

    public static void main(String[] args) {

        Microwave microwave = new Microwave("Samsung", "1.01(kWh)", "Microwave", true, 100, 0);

        microwave.setCapacity();
        microwave.startHeating();
        microwave.printApplianceInfo();
        microwave.resetSpecificAppliance();
        microwave.printApplianceInfo();

    }
}
