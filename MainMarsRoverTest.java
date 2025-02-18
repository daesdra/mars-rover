package Mars;

public class MarsRoverChecker {
    public static void main(String[] args) {
        // 0 = Empty cell, 1 = Obstacle
        int[][] marsMap = {
                {0, 0, 1, 0, 0},
                {1, 0, 0, 0, 0},
                {0, 0, 0, 1, 0},
                {1, 0, 0, 0, 0},
                {0, 0, 0, 0, 0}
        };

        // Instantiate MarsRover object
        MarsRover rover = new MarsRover(0, 0, marsMap); // Starting at position (0, 0), ending at position (4, 4)
        
        // TODO: Create a series of commands to move the rover to a specific target.
        rover.executeCommand(new MoveEastCommand()); // new location: (1, 0)
        rover.executeCommand(new MoveSouthCommand()); // (1, 1)
        rover.executeCommand(new MoveSouthCommand()); // (1, 2)
        rover.executeCommand(new MoveSouthCommand()); // (1, 3)
        rover.executeCommand(new MoveEastCommand()); // (2, 3)
        rover.executeCommand(new MoveNorthCommand()); // (2, 2) 
        rover.executeCommand(new MoveSouthCommand()); // (2, 3)    
        rover.executeCommand(new MoveEastCommand()); // (3, 3)     
        rover.executeCommand(new MoveEastCommand()); // (3, 4)
        rover.executeCommand(new MoveSouthCommand()); // (4, 4)

    }
}
