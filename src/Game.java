import javax.lang.model.util.ElementScanner6;
import java.util.concurrent.TimeUnit;

public class Game {

    /*
    Contains the main gameloop

    */

    public void Setup() throws InterruptedException {
        //TODO
        GUI g = new GUI(400, 400);
        Snake snake = new Snake();
        SnakeParts snakeParts = snake.addSnakeParts(1, 100,100);
        g.drawSnakepart(snakeParts);

        // Game Loop
        while (true){
            //TODO
            TimeUnit.SECONDS.sleep(3);
            // The snake moves one step to the left
            snake.move("left", g);
        }
    }

    private boolean checkPosition(Fruit fruit, int[] pos) {
        boolean isFruit = false;
        boolean isOutsideBoard = false;
        boolean isSnake = false;
        int[] fruitPos = fruit.getPosition();
        if (pos == fruitPos) {
            isFruit = true;
        } else if (pos[1] > 99 || pos[1] < 0 || pos[2] > 99 || pos[2] < 0) {
            isOutsideBoard = true;
        }
        if (isFruit == true) {
            //eat(); //TODO
            return false;
        } else if (isOutsideBoard == true) {
            //dead(); //TODO
            return false;
        } else if (isSnake == true) {
            //dead(); //TODO
            return false;
        }
        return true;
    }
}
