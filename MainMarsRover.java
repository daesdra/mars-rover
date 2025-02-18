package Mars;
public class MarsRover {
    private int x; 
    private int y;
    private int[][] map; // the current world map

    public MarsRover(int x, int y, int[][] marsMap ) {
      this.x = x;
      this.y = y;
      this.map = marsMap;  
    }

    // Execute a command
    public void executeCommand(Command command) {
        command.execute(this); 
        System.out.println("Rover is now at: (" + x + ", " + y + ")");
    }

    // Getter and setter for X
    public int getX() {
        return x; 
    }

    public void setX(int x) {
        this.x = x; 
    }

    // Getter and setter for Y
    public int getY() {
        return y; 
    }

    public void setY(int y) {
        this.y = y; 
    }

    // Check if a move is valid
    public boolean isValidMove(int newX, int newY) {

        // Determine direction: 
        String direction = "";
        if (newX < 0) direction = "west";
        else if (newX >= map[0].length) direction = "east";
        else if (newY < 0) direction = "north"; 
        else if (newY >= map.length) direction = "south";
        
        // Check if move is on the board
        if (newX < 0 || newX >= map[0].length || newY < 0 || newY >= map.length) {
          if (!direction.isEmpty()) {
          System.out.println("Move " + direction + " is invalid (out of bounds or obstacle)."); 
          }
          return false;
        }
        // Check if move is unobstructed
        if (map[newY][newX] == 1) {
          System.out.println("Error: Obstacle encountered at (" + newX + ", " + newY +").");
          return false;
        }

        return true; 
    }
}