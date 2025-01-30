package lesson11.exercise3;

public class Appliance {

    public String brand;
    public String powerConsumption;
    public String type;
    public boolean factoryReset;

    public Appliance(String brand, String powerConsumption, String type, boolean factoryReset) {
        this.brand = brand;
        this.powerConsumption = powerConsumption;
        this.type = type;
        this.factoryReset = factoryReset;
    }

    public void printApplianceInfo() {
        System.out.println("------------------------");
        System.out.println("Appliance info:");
        System.out.println("------------------------");
        System.out.println("Type of appliance: " + type);
        System.out.println("Brand: " + brand);
        System.out.println("Power Consumption: " + powerConsumption);

    }

    public boolean factoryResetON() {
        System.out.println("Starting factory reset...");
        this.factoryReset = true;
        return true;
    }

    public void resetSpecificAppliance() {
        if (factoryResetON()) {
            System.out.println("Adjusting value to default one.");
        }
    }
}
