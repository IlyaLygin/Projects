package HW1;

public class robot implements runnable, jumpable {

    private int runLimit, jumpLimit;

    public robot(int runLimit, int jumpLimit) {
        this.runLimit = runLimit;
        this.jumpLimit = jumpLimit;
    }

    @Override
    public void jump(int limit) {
        if (limit<jumpLimit){
            jumpLimit -=limit;
            System.out.println("Robot jump to " + limit + " m");
            System.out.println("Now jumpLimit = " + jumpLimit);
        } else {
            System.out.println("Robot cannot jump to " + limit + " m");
        }
    }

    @Override
    public void run(int limit) {
        if (limit<runLimit){
            runLimit -=limit;
            System.out.println("Robot run to " + limit + " m");
            System.out.println("Now runLimit = " + jumpLimit);
        } else {
            System.out.println("Robot cannot run to " + limit + " m");
        }
    }
}
