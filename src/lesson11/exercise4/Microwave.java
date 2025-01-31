package lesson11.exercise4;

import java.util.Scanner;

public class Microwave extends Appliance{
    Scanner scanner = new Scanner(System.in);

    public int curTemp = 0;
    public int capacity;
    public int curLoad;

    public Microwave(String brand, String powerConsumption, String type, boolean factoryReset, int capacity, int curLoad){
        super(brand, powerConsumption, type, factoryReset);

        //        this.curTemp = curTemp;
        this.capacity = capacity;
        this.curLoad = curLoad;
    }

    @Override
    public void setTemperature(){
        System.out.println("Adjust desired microwave temperature: ");
        this.curTemp = scanner.nextInt();

        if (!(this.curTemp >= -10 && this.curTemp <=100 && this.curTemp != 0)){
            throw new IllegalArgumentException("Invalid temperature: " + curTemp + ". Temperature cannot be lower than -10 and higher than 100, or 0.");
        }
    }

    public void startHeating(){
        setTemperature();
        System.out.println("start heating at: " + curTemp + " degrees");
    }

    public void setCapacity(){
        System.out.println("Enter the size of the food you wish to warm up in liters: ");
        this.capacity = scanner.nextInt();

        if (!(this.capacity >= 0 && this.capacity <=32)){
            throw new IllegalArgumentException("Invalid size of food: " + capacity + ". Food cannot exceed 32 liters.");
        }
    }

    public void printApplianceInfo(){
        super.printApplianceInfo();

        System.out.println("Temperature is set to: " + this.curTemp + " degrees");
        System.out.println("Food size is: " + this.capacity + " liters");
    }
    @Override
    public void resetSpecificAppliance(){
        System.out.println("-----------------");
        if (factoryResetON()){
            setTemperature();
            System.out.println("Adjusted temperature to: " + this.curTemp + " degrees");
        }
    }

}

