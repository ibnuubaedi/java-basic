package Section03.Content;

public class Circuit {

    private int firstSwitch;
    private int secondSwitch;
    private int lamp;

    public Circuit(int firstSwitch, int secondSwitch){
        this.firstSwitch = firstSwitch;
        this.secondSwitch = secondSwitch;
    }

    public Circuit(){
        this.firstSwitch = 0;
        this.secondSwitch = 0;
    }

    public int getFirstSwitchState(){
        return this.firstSwitch;
    }

    public int getSecondSwitchState(){
        return this.secondSwitch;
    }

    public int getLampState(){
        int status = firstSwitch + secondSwitch;
        if (status == 2){
            return this.lamp = 1;
        } else {
            return this.lamp = 0;
        }
    }

    public void toggleFirstSwitch(int click){
        this.firstSwitch = click;
    }

    public void toggleSecondSwitch(int click){
        this.secondSwitch = click;
    }

}
