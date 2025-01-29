package lesson11.exercise2;

import java.util.Scanner;

public class Refrigerator extends Appliance {

    Scanner scanner = new Scanner(System.in);
    int temperature;

    public Refrigerator(String brand, String powerConsumption, String type) {
        super(brand, powerConsumption, type);
//        this.temperature = temperature;
    }

    public void setTemperature(){
        System.out.println("Enter desired refrigerator temperature: ");
        this.temperature = scanner.nextInt();

        if (!(this.temperature >= -3 && this.temperature <=5)){
            this.temperature = 0;
        }
    }

    public void printApplianceInfo(){
        super.printApplianceInfo();

        System.out.println("Temperature is set to: " + this.temperature);
    }
}
