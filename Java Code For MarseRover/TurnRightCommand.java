public class TurnRightCommand implements Command {
    public void execute(Rover rover) {
        rover.turnRight();
    }
}
