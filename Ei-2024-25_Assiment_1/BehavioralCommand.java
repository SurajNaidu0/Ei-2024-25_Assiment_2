//Here MarsRover is turned on and of using a remote which is implemented using Command Pattern
// Image is attached with it please refer that to see the implemented logic
interface ICommand {
    public void excute();
}
class MyRemoteControl{
    ICommand command;
    MyRemoteControl(){

    }
    public void setCommand(ICommand command){
        this.command = command;
    }
    public void pressButton(){
        command.excute();
    }
}
class MarsRover{
    boolean isOn;
    boolean signalAvailable =true;
    public void turnOnRover(){
        if (signalAvailable) {
            isOn = true;
        }
        else{
            System.out.println("No signal avaliable");
        }
    }
    public void turnOffRover(){
        if (signalAvailable){
            isOn = false;
        }
        else{
            System.out.println("No signal avaliable");
        }
    }
}
class TurnRoverOn implements ICommand{
    MarsRover rover;
    TurnRoverOn (MarsRover rover){
        this.rover = rover;
    }
    @Override
    public void excute(){
        rover.turnOnRover();
    }
}
class TurnRoverOff implements ICommand{
    MarsRover rover;
    TurnRoverOff(MarsRover rover){
        this.rover = rover;
    }
    @Override
    public void excute(){
        rover.turnOffRover();
    }
}

public class BehavioralCommand {
    public static void main(String[] args){
        MarsRover rover = new MarsRover();

        MyRemoteControl remote1 = new MyRemoteControl();
        MyRemoteControl remote2 = new MyRemoteControl();

        remote1.setCommand(new TurnRoverOn(rover));
        remote2.setCommand(new TurnRoverOff(rover));

        remote1.pressButton();
        System.out.println("Rover State " +rover.isOn);

        remote2.pressButton();
        System.out.println("Rover State " +rover.isOn);

    }
}
