package HW1;

public class treadmill {
    private int length;

    public treadmill(int length) {
        this.length = length;
    }

    public void take(runnable Runnable){
    Runnable.run(length);
    }
}
