public class Grid {
    private int length;
    private int breadth;
    private int[][] area; 

    public Grid(int width, int height) {
        this.length = width;
        this.breadth = height;
        this.area = new int[height][width];
    }

    
    public void addObstacle(int x, int y) {
        area[y][x] = 1;
    }

    public boolean isWithinBounds(int x, int y) {
        return x >= 0 && x < length && y >= 0 && y < breadth;
    }

    public boolean isObstacle(int x, int y) {
        return area[y][x] == 1;
    }
}
