package Section03.ProgrammingProject;

public class BatteryTester {

    public static void main(String[] args) {

        Battery myBattery = new Battery(3000.0);
        System.out.println(myBattery.getRemainingCapacity());
        myBattery.drain(1000.0);
        System.out.println(myBattery.getRemainingCapacity());
        myBattery.drain(1000.0);
        System.out.println(myBattery.getRemainingCapacity());
        myBattery.charge();
        System.out.println(myBattery.getRemainingCapacity());
    }

}
