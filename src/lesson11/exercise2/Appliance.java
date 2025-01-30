package lesson11.exercise2;

import java.util.Scanner;

public class Appliance {

    Scanner scanner = new Scanner(System.in);

    public String brand;
    public String powerConsumption;
    public String type;
    int temperature;
    public boolean washingOnOff = false;


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

    public void setTemperature(){
        System.out.println("Enter desired refrigerator temperature: ");
        this.temperature = scanner.nextInt();

        if (!(this.temperature >= -3 && this.temperature <=5)){
            this.temperature = 0;
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
}
