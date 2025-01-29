package lesson11.exercise3;

public class WashingMachine extends Appliance {

    public String color;
    public int loadCapacity;
    public boolean washingOnOff = false;

    public WashingMachine(String brand, String powerConsumption, String type, boolean factoryReset, String color, int loadCapacity){
        super(brand, powerConsumption, type, factoryReset);
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
    @Override
    public void resetSpecificAppliance(){
        if (factoryResetON()){
            System.out.println("Adjusting load capacity to 0.");
            this.loadCapacity = 0;
        }
    }

}
