package Section03.Content;

public class SwitchTester {

    public static void main(String[] args) {

        Circuit circuit = new Circuit();
        circuit.toggleFirstSwitch(1);
        System.out.println(circuit.getFirstSwitchState());
        System.out.println(circuit.getSecondSwitchState());
        System.out.println(circuit.getLampState());
        circuit.toggleSecondSwitch(1);
        System.out.println(circuit.getFirstSwitchState());
        System.out.println(circuit.getSecondSwitchState());
        System.out.println(circuit.getLampState());

    }

}
