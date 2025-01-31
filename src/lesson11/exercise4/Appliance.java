package lesson11.exercise4;

import java.util.Scanner;

public class Appliance {

    Scanner scanner = new Scanner(System.in);
    public String brand;
    public String powerConsumption;
    public String type;
    public boolean factoryReset;
    public boolean washingOnOff = false;
    public int curTemp = 0;


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

    public boolean turnOn(){
        System.out.println("Starting washing machine...");
        this.washingOnOff = true;
        return true;
    }

    public boolean turnOff(){
        System.out.println("Stopping washing machine...");
        this.washingOnOff = false;
        return false;
    }

    public void washingCycle(){
        if (washingOnOff){
            System.out.println("Washing cycle initiated because this.washingOnOff was set to true");
        }
    }

    public void setTemperature(){
        System.out.println("Adjust temperature: ");
        this.curTemp = scanner.nextInt();

        if (!(this.curTemp >= -10 && this.curTemp <=100 && this.curTemp != 0)){
            throw new IllegalArgumentException("Invalid temperature: " + curTemp + ". Temperature cannot be lower than -10 and higher than 100, or 0.");
        }
    }
}
