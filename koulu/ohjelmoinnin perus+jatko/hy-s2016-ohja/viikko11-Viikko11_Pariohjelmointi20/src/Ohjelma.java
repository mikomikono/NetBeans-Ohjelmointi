
import rooms.Robot;

public class Ohjelma {

    public static void main(String[] args) {
        // toteuta tänne pariohjelmoiden pajassa annettu tehtävä "Pariohjelmointi 20"
        // tehtävä tarkistetaan pajassa

        String huone = "xxxxxxx\n"
                     + "xx  x x\n"
                     + "xxx xxx\n"
                     + "x     x";

        Robot robot = new Robot(huone, 0, 0);

        // olemassaolevat komennot
        // robot.go('E')
        // robot.go('S')
        // robot.go('W')
        // robot.go('N')
        // ja
        // robot.say("trolololo")
        
        int x = 3;
        robot.go('W');
        if (robot.check('N')) {
            robot.go('N');
        }
        robot.go('W');
        robot.say(x + " rooms");
        robot.go('W');
    }
}
