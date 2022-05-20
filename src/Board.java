import java.util.Random;

public class Board {
    //should contain some kind of grid? Either a simple integer matrix or a seperate class??

    public Board() {
        //initialize shit
        int[] x = new int[100];
        int[] y = new int[100];
    }

    /**
     *Used to place fruits during the game
     */
    public void placeFruit() {
        //TODO
        /*
         pics a random cell in the grid
         checks that it is empty 
         places a fruit there 
         */

         Random random = new Random();
         int rand1 = random.nextInt(400);
         int rand2 = random.nextInt(400);
         Fruit fruit = new Fruit();
         int[] pos = {rand1, rand2};
         fruit.setPosition(pos);

    }

}