public class TurnLeftCommand implements Command {
    public void execute(Rover rover) {
        rover.turnLeft();
    }
}
