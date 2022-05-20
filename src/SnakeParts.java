public class SnakeParts{  
    private int xpos;
    private int ypos;
    private int prevXpos;
    private int prevYpos;

    public SnakeParts(int x, int y){
        this.xpos = x;
        this.ypos = y;
        //Initialize positionfields
    }

    public int[] getPosition() {
        int[] pos = {xpos, ypos};
        return pos;
    }

    //When the snake moves the position fields should change too
    //Not sure which param we should use
    public void ChangePos(){
        //TODO

    }


}

