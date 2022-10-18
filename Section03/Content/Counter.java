package Section03.Content;

public class Counter {

    private int value;
    private int maximum;

    public Counter(){
        this.value = 0;
    }

    public void onClick(){
        this.value = this.value + 1;
        int limit = Math.min(this.value,this.maximum);
        this.value = limit;
    }

    public int getValue(){
        return this.value;
    }

    public void reset(){
        this.value = 0;
    }

    public void undo(){
        this.value = this.value - 1;
        int cancel = Math.max(this.value,0);
        this.value = cancel;
    }

    public void setLimit(int maximum){
        this.maximum = maximum;
    }

    public static void main(String[] args) {
        Counter testCounter = new Counter();
        testCounter.onClick();
        testCounter.onClick();
        System.out.println(testCounter.getValue());

    }

}
