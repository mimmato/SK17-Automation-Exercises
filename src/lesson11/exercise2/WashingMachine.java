package lesson11.exercise2;

public class WashingMachine extends Appliance {

    public String color;
    public String loadCapacity;
    public boolean washingOnOff = false;

    public WashingMachine(String brand, String powerConsumption, String type, String color, String loadCapacity){
        super(brand, powerConsumption, type);
        this.color = color;
        this.loadCapacity = loadCapacity;
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

    public void printApplianceInfo(){

        super.printApplianceInfo();

        System.out.println("Color: " + color);
        System.out.println("Load Capacity: " + loadCapacity);

    }

}
