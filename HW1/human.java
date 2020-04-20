package HW1;

public class human implements runnable, jumpable {

    private int runLimit, jumpLimit;

    public human(int runLimit, int jumpLimit) {
        this.runLimit = runLimit;
        this.jumpLimit = jumpLimit;
    }

    @Override
    public void jump(int limit) {
        if (limit<jumpLimit){
            jumpLimit -=limit;
            System.out.println("Human jump to " + limit + " m");
            System.out.println("Now jumpLimit = " + jumpLimit);
        } else {
            System.out.println("Human cannot jump to " + limit + " m");
        }
    }

    @Override
    public void run(int limit) {
        if (limit<runLimit){
            runLimit -=limit;
            System.out.println("Human run to " + limit + " m");
            System.out.println("Now runLimit = " + jumpLimit);
        } else {
            System.out.println("Human cannot run to " + limit + " m");
        }
    }
}
