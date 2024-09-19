import java.util.List;
import java.util.Map;

public class MarsRoverSimulation {
    private Grid grid;
    private Rover rover;

    public MarsRoverSimulation(int[] gridSize, int[] startPosition, String startDirection, List<int[]> obstacles) {
        this.grid = new Grid(gridSize[0], gridSize[1]);
        for (int[] obstacle : obstacles) {
            grid.addObstacle(obstacle[0], obstacle[1]);
        }

        this.rover = new Rover(startPosition[0], startPosition[1], startDirection, grid);
    }

    public void runCommands(List<String> commands) {
        Map<String, Command> commandMap = Map.of(
                "M", new MoveCommand(),
                "L", new TurnLeftCommand(),
                "R", new TurnRightCommand()
        );

        for (String command : commands) {
            rover.executeCommand(commandMap.get(command));
        }
    }

    public int[] getFinalPosition() {
        return rover.getPosition();
    }

    public String getFinalDirection() {
        return rover.getDirection();
    }

    public String getStatusReport() {
        return rover.getStatusReport();
    }
}
