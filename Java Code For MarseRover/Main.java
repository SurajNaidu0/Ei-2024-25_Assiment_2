import java.util.*;
public class Main {
    public static void main(String[] args) {
        int[] gridSize = {10, 10};
        int[] startPosition = {0, 0};
        String startDirection = "N";
        List<int[]> obstacles = Arrays.asList(new int[]{2, 2}, new int[]{3, 5},new int[]{1,6});
        List<String> commands = Arrays.asList("M", "M", "R", "M", "L", "M","R","M");

        MarsRoverSimulation simulation = new MarsRoverSimulation(gridSize, startPosition, startDirection, obstacles);
        simulation.runCommands(commands);

        int[] finalPosition = simulation.getFinalPosition();
        String finalDirection = simulation.getFinalDirection();
        String statusReport = simulation.getStatusReport();

        System.out.printf("Final Position: (%d, %d, %s)%n", finalPosition[0], finalPosition[1], finalDirection);
        System.out.println("Status Report: " + statusReport);
    }
}