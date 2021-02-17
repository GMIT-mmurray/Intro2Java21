import java.util.Date;

public class Main {

    public static void main(String[] args) {

        Fan f1 = new Fan();
        Fan f2 = new Fan();

        f1.setSpeed(Fan.FAST);
        f1.setRadius(10);
        f1.setColor("yellow");
        f1.setOn(true);

        f2.setSpeed(Fan.MEDIUM);
        f2.setRadius(5);
        f2.setColor("blue");
        f2.setOn(false);

        System.out.println(f1);
        System.out.println(f2);
    }
}
