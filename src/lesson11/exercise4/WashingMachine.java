package lesson11.exercise4;

public class WashingMachine extends Appliance {

    public String color;
    public int loadCapacity;

    public WashingMachine(String brand, String powerConsumption, String type, boolean factoryReset, String color, int loadCapacity){
        super(brand, powerConsumption, type, factoryReset);
        this.color = color;
        this.loadCapacity = loadCapacity;
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
