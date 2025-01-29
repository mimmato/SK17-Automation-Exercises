package lesson11.exercise2;

public class Appliance {

    public String brand;
    public String powerConsumption;
    public String type;

    public Appliance(String brand, String powerConsumption, String type) {
        this.brand = brand;
        this.powerConsumption = powerConsumption;
        this.type = type;
    }

    public void printApplianceInfo(){

        System.out.println("Appliance info:");
        System.out.println("------------------------");
        System.out.println("Type of appliance: " + type);
        System.out.println("Brand: " + brand);
        System.out.println("Power Consumption: " + powerConsumption);
    }
}
