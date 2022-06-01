import java.util.ArrayList;

import javax.management.MBeanRegistration;

public class Room implements Moveable {
    private Exit north, east, south, west;
    private GridSquare[][] grid = new GridSquare[3][3];
    private int currentPos;
    private NPC npcNorth, npcEast, npcSouth, npcWest;

    // int vals for door:
    // 0 = no door
    // 1 == wall
    // 2 = undiscovered space

    public Room(Direction enterPos) {
        // make a switch case statement for ids of each room and draw them indivudally
        north = new Exit(Direction.NORTH);
        east = new Exit(Direction.EAST);
        south = new Exit(Direction.SOUTH);
        west = new Exit(Direction.WEST);
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                grid[i][j] = new GridSquare(j);
            }
        }

        for (GridSquare G[] : grid) {
            for (GridSquare g : G) {
                g.setIcon("    ");
            }
        }

        for (GridSquare g : grid[0]) {
            g.setIcon("--");
        }
        for (GridSquare g : grid[2]) {
            g.setIcon("--");
        }

        grid[1][0].setIcon("|");
        grid[1][2].setIcon("|");

        switch (enterPos) {
            case NORTH:
                currentPos = 8;
            case EAST:
                currentPos = 6;
            case SOUTH:
                currentPos = 2;
            case WEST:
                currentPos = 4;
        }
        if (northDoor == 2) {
            grid[0][1].setIcon("@");
        } else if (northDoor == 1) {
            grid[0][1].setIcon("--");
        } else {
            grid[0][1].setIcon("  ");
        }

        if (eastDoor == 2) {
            grid[1][2].setIcon("@");
        } else if (northDoor == 1) {
            grid[1][2].setIcon("|");
        } else {
            grid[1][2].setIcon("  ");
        }

        if (southDoor == 2) {
            grid[2][1].setIcon("@");
        } else if (southDoor == 1) {
            grid[2][1].setIcon("--");
        } else {
            grid[2][1].setIcon("  ");
        }

        if (westDoor == 2) {
            grid[1][0].setIcon("@");
        } else if (westDoor == 1) {
            grid[1][0].setIcon("|");
        } else {
            grid[1][0].setIcon("  ");
        }

    }

    @Override
    public boolean moveNorth() {
        currentPos -= 3;
        return false;
    }

    @Override
    public boolean moveEast() {
        currentPos += 1;
        return false;
    }

    @Override
    public boolean moveSouth() {
        currentPos += 3;
        return false;
    }

    @Override
    public boolean moveWest() {
        currentPos -= 1;
        return false;
    }

    public String[][] print() {
        String[][] retval = new String[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                retval[i][j] = grid[i][j].getIcon();
            }
        }
        return retval;
    }

}