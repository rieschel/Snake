import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferStrategy;

public class GUI extends Canvas {
    private JFrame frame;
    private Canvas canvas;
    private Graphics2D g;
    private BufferStrategy bufferStrategy;


    public GUI(int width, int height) {
        frame = new JFrame("Hello");
        frame.setPreferredSize(new Dimension(width, height));
        frame.setMinimumSize(new Dimension(width, height));
        frame.setMaximumSize(new Dimension(width, height));

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        canvas = new Canvas();
        canvas.setBounds(0, 0, width, height);
        canvas.setIgnoreRepaint(true);

        frame.add(canvas);

        canvas.createBufferStrategy(2);
        bufferStrategy = canvas.getBufferStrategy();

        canvas.requestFocus();

        g = (Graphics2D) bufferStrategy.getDrawGraphics();
        g.clearRect(0, 0, width, height);
        //g.fillRect(0, 0, width, height);
        //g.setColor(Color.blue);
        //g.drawRect(50,50,50,50);
        //g.setColor(Color.GREEN);
        //g.fillRect(50,50,50,50);
        //g.fillRect(105,50,50,50);

        //test();

        g.dispose();
        bufferStrategy.show();
    }

    public void test(){
        g.setColor(Color.blue);
        g.fillRect(105,50,50,50);
    }


    public void drawSnakepart(SnakeParts snakePart){
        BufferStrategy bs = canvas.getBufferStrategy();
        canvas.requestFocus();
        Graphics2D g2 = (Graphics2D) bs.getDrawGraphics();


        int[] pos = snakePart.getPosition();
        int xpos = pos[0];
        int ypos = pos[1];
        g2.setColor(Color.red);
        g2.fillRect(xpos, ypos, 50,50);
        g2.dispose();
        bs.show();

    }

    public void eraseSnakepart(SnakeParts snakePart) {
        BufferStrategy bs = canvas.getBufferStrategy();
        canvas.requestFocus();
        Graphics2D g2 = (Graphics2D) bs.getDrawGraphics();


        int[] pos = snakePart.getPosition();
        int xpos = pos[0];
        int ypos = pos[1];
        g2.clearRect(xpos, ypos, 50,50);
        g2.dispose();
        bs.show();
    }

    private void drawFruit(Fruit fruit) {
        // draw the fruit
    }

    private void eraseFruit(Fruit fruit) {
        // erase the fruit
    }
}