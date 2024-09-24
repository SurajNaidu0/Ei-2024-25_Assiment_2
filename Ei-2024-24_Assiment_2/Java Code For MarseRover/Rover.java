public class Rover {
    private int x;
    private int y;
    private int directionIndex;
    private Grid grid;
    private static final int[][] DIRECTIONS = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}}; // N, E, S, W
    private static final String[] DIRECTION_NAMES = {"North", "East", "South", "West"};

    public Rover(int x, int y, String direction, Grid grid) {
        this.x = x;
        this.y = y;
        this.directionIndex = getDirectionIndex(direction);
        this.grid = grid;
    }

    private int getDirectionIndex(String direction) {
        return switch (direction) {
            case "N" -> 0;
            case "E" -> 1;
            case "S" -> 2;
            case "W" -> 3;
            default -> throw new IllegalArgumentException("Invalid direction: " + direction);
        };
    }

    public void executeCommand(Command command) {
        command.execute(this);
    }

    public void move() {
        int newX = x + DIRECTIONS[directionIndex][0];
        int newY = y + DIRECTIONS[directionIndex][1];
        if (!grid.isWithinBounds(newX, newY)) {
            System.out.println("Can't move. Robot would be out of the Grid.");
        } else if (grid.isObstacle(newX, newY)) {
            System.out.println("Can't move because an obstacle is in the way.");
        } else {
            x = newX;
            y = newY;
        }
    }

    public void turnLeft() {
        directionIndex = (directionIndex - 1 + 4) % 4;
    }

    public void turnRight() {
        directionIndex = (directionIndex + 1) % 4;
    }

    public String getStatusReport() {
        return String.format("Rover is at (%d, %d) facing %s. No obstacles detected.", x, y, DIRECTION_NAMES[directionIndex]);
    }

    public int[] getPosition() {
        return new int[]{x, y};
    }

    public String getDirection() {
        return DIRECTION_NAMES[directionIndex];
    }
}
