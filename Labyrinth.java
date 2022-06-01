import java.util.ArrayList;
import java.util.concurrent.ArrayBlockingQueue;

public class Labyrinth implements Moveable {
    private Room[][] rooms = new Room[4][4];
    private int currentPos;

    public Labyrinth() {
        for (int i = 0; i < rooms.length; i++) {
            for (int j = 0; j < rooms[i].length; j++) {
                rooms[i][j] = new Room(Direction.SOUTH, 0, 1, 1, 1);
            }
        }
    }

    public void printMap() {
        for (int i = 0; i < 4; i++) {
            for (Room r : rooms[i]) {
                for (String a : r.print()[0]) {
                    System.out.print(a);
                }
            }

            System.out.println();

            for (Room r : rooms[i]) {
                for (String a : r.print()[1]) {
                    System.out.print(a);
                }

            }
            System.out.println();

            for (Room r : rooms[i]) {
                for (String a : r.print()[2]) {
                    System.out.print(a);
                }
            }

            System.out.println();

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
}