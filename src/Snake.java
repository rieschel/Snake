import java.util.*;

public class Snake {
    //private SnakeParts[] snakeParts;
    private ArrayList<SnakeParts> snakeParts;
    private boolean isDead;
    private String currentDir;
    //private SnakeParts end;
    //private SnakeParts front;

    public Snake(){
        snakeParts = new ArrayList<>();
        isDead = false;
        currentDir = "left";

    }

    /**
     * When the user presses the keys
     * @param dir the direction the snake is supposed to move in
     * @return true if the snake is dead    
     */
    public boolean move(String dir, GUI g){
        if (dir.equals("left")) {
            g.eraseSnakepart(snakeParts.get(0));
            int[] pos = snakeParts.get(0).getPosition();
            int xpos = pos[0] - 50;
            int ypos = pos[1];
            SnakeParts newPart = addSnakeParts(1, xpos, ypos);
            g.drawSnakepart(newPart);
        }

        return false;
    }

    /**
     * Used when the snake eats a fruit
     * @param numOfParts number of parts to add to the snake
    */
    public SnakeParts addSnakeParts(int numOfParts, int x, int y){
        SnakeParts snakePart = new SnakeParts(x, y);
        snakeParts.add(snakePart);
        System.out.println("Test2");
        return snakePart;
    }

}