package Mars;
// Abstract Command class
abstract class Command {
    public abstract void execute(MarsRover rover);
}

// Base class for movements 
class MoveCommand extends Command {
    private int dx, dy; // delta x, delta y
    
    public MoveCommand(int dx, int dy) {
      this.dx = dx;
      this.dy = dy;
    }

  @Override
  public void execute(MarsRover rover) {
    int newX = rover.getX() + dx;
    int newY = rover.getY() + dy;

    if (!rover.isValidMove(newX, newY))  return; 
    
    rover.setX(newX);
    rover.setY(newY);
  }
}

// MoveNorthCommand
class MoveNorthCommand extends MoveCommand {
  public MoveNorthCommand() {super(0, -1); }
}

// MoveSouthCommand
class MoveSouthCommand extends MoveCommand {
  public MoveSouthCommand() {super(0, 1); }
}

// MoveEastCommand
class MoveEastCommand extends MoveCommand {
  public MoveEastCommand() {super(1, 0); }
}

// MoveWestCommand
class MoveWestCommand extends MoveCommand {
  public MoveWestCommand() {super(-1, 0); }
}