# Mars Rover
My implementation of a rover which navigates a Martian surface, according to assignment specifications. 
## About Project
This project was the mid-term project for my Object Oriented Programming course, which introduced Java. 
There is no version control history for this project because it was completed in the Codio IDE, per given instructions. 

Although I would have liked to implement a breadth-first-search algorithm to grant the rover more independence and efficiency, this was not part of the permitted code format. 
Students were provided with the following prompt:

"You are provided with a skeleton code that includes a representation of a 5x5 grid, which serves as a map of the Martian surface. The rover must be moved from its starting position (0, 0) to a target position (4, 4) while avoiding obstacles.
The map is represented as a 2D array where:

    0 represents an empty cell that the rover can traverse.
    1 represents an obstacle that the rover cannot pass through.

You will implement command classes that extend an abstract “Command” class to move the rover in different directions (north, south, east, west). These commands will be used to guide the rover to its destination.
Your Task

    Implement the movement logic for each command.
    Handle boundary conditions and obstacles.
    Use a sequence of commands to move the rover to the target.
    Although we provide a map for you to test your solution, the final solution should be able to handle maps of any dimension together with any start and target position.
        
"
