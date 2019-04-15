package pong;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
import java.awt.Color;
import java.awt.Graphics;

public class Ball extends Block {

    private int XSpeed;
    private int YSpeed;

    public Ball() {
        super(200, 200);
        XSpeed = 3;
        YSpeed = 1;
    }

    public Ball(int x, int y) {
        super(x, y);
        XSpeed = 3;
        YSpeed = 1;
    }

    public Ball(int x, int y,int xs,int ys) {
        super(x, y);
        XSpeed = xs;
        YSpeed = ys;
    }

    //add the other Ball constructors
    //add the set methods
    public void moveAndDraw(Graphics window) {
        //draw a white ball at old ball location

        setX(getX() + getXSpeed());
		//setY

        //draw the ball at its new location
    }

    public boolean equals(Object obj) {
        Ball temp = (Ball) obj;
        return this.getxPos() == temp.getxPos() && this.getyPos() == temp.getyPos() && this.getWidth() == temp.getWidth() && this.getHeight() == temp.getHeight();

    }

   //add the get methods
    //add a toString() method
    public int getXSpeed() {
        return XSpeed;
    }

    public void setXSpeed(int xSpeed) {
        this.XSpeed = xSpeed;
    }

    public int getYSpeed() {
        return YSpeed;
    }

    public void setYSpeed(int ySpeed) {
        this.YSpeed = ySpeed;
    }
}
