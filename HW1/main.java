package HW1;

import java.util.Random;

public class main {
    public static void main(String[] args) {
        wall [] walls = new wall[5];
        treadmill [] treadmills = new treadmill[5];
        Random rand = new Random();
        for (int i = 0; i < 5; i++) {
            walls[i]=new wall(rand.nextInt(1+10));
            treadmills[i]=new treadmill(rand.nextInt(1+100));
        }
        for (int i = 0; i <15 ; i++) {
            cat Cat = new cat (rand.nextInt(1+10), rand.nextInt(1+100));
            human Human = new human (rand.nextInt(1+10), rand.nextInt(1+100));
            robot Robot = new robot (rand.nextInt(1+10), rand.nextInt(1+100));
            for (int j = 0; j <5 ; j++) {
                walls[j].take(Cat);
                treadmills[j].take(Cat);
                walls[j].take(Human);
                treadmills[j].take(Human);
                walls[j].take(Robot);
                treadmills[j].take(Robot);
            }
        }
    }
}
