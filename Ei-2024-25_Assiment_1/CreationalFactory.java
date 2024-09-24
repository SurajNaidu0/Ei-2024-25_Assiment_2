//I have created a RobotFactory which can future call which robot is needed
//By doing this we can easily chance the creation in robot
//Say in future if Cooking robot get update which allows it to clean also this can be easily changed using our factory method
// Image is attached with it please refer that to see the implemented logic
interface Robot {
    public void Task();
}

class CleaningRobot implements Robot {
    @Override
    public void Task() {
        System.out.println("Cleaning Started");
    }
}

class CookingRobot implements Robot {
    @Override
    public void Task() {
        System.out.println("Cooking Started");
    }
}

class SecurityRobot implements Robot {
    @Override
    public void Task() {
        System.out.println("Security Started");
    }
}

class RobotFactory {
    public Robot getRobot(String value) {
        if (value.equals("Cleaning")) {
            return new CleaningRobot();
        } else if (value.equals("Cooking")) {
            return new CookingRobot();
        } else if (value.equals("Security")) {
            return new SecurityRobot();
        }
        return null;
    }
}

public class CreationalFactory {
    public static void main(String[] args) {
        System.out.println("Hello World!");


        RobotFactory robotfactory = new RobotFactory();
        Robot cookingrobot = robotfactory.getRobot("Cooking");
        cookingrobot.Task();
        Robot securityrobot = robotfactory.getRobot("Security");
        securityrobot.Task();
        Robot cleaningrobot = robotfactory.getRobot("Cleaning");
        cleaningrobot.Task();
    }
}
