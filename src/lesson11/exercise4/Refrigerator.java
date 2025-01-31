package lesson11.exercise4;

import java.util.Scanner;

public class Refrigerator extends Appliance {

    Scanner scanner = new Scanner(System.in);
    int temperature;

    public Refrigerator(String brand, String powerConsumption, String type, boolean factoryReset, int temperature) {
        super(brand, powerConsumption, type, factoryReset);
//        this.temperature = temperature;
    }

    @Override
    public void setTemperature(){
        System.out.println("Enter desired refrigerator temperature: ");
        this.temperature = scanner.nextInt();

        if (!(this.temperature >= -3 && this.temperature <=5)){
//            throw new IllegalArgumentException("Invalid temperature: " + this.curTemp + ". Temperature cannot be lower than -3 and higher than 5.");
            this.temperature = 0;
        }
    }

    public void printApplianceInfo(){
        super.printApplianceInfo();

        System.out.println("Temperature is set to: " + this.temperature);
    }

    @Override
    public void resetSpecificAppliance(){
        if (factoryResetON()){
            System.out.println("Adjusting Refrigerator temperature to 0.");
            this.temperature = 0;
        }
    }

}
