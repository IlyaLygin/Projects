package HW1;

public class wall {

    private int height;

    public wall(int height) {
        this.height = height;
    }

    public void take(jumpable Jumpable){
        Jumpable.jump(height);
    }
}
