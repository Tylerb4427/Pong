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
    
    public Ball(int x, int y,int w, int h,Color c,int xs,int ys) {
        super(x, y,w,h,c);
        XSpeed = xs;
        YSpeed = ys;
    }

        public Ball(int x, int y,int w, int h,Color c) {
        super(x,y,w,h,c);
        XSpeed = 3;
        YSpeed = 1;
    }
    //add the other Ball constructors
    //add the set methods
    public void moveAndDraw(Graphics window) {
        //draw a white ball at old ball location
        window.setColor(Color.white);
        window.fillOval(super.getxPos(),super.getyPos(),super.getWidth(),super.getHeight());
        setxPos(getxPos() + getXSpeed());
        setyPos(getyPos() + getYSpeed());
        //draw(window,getColor());
        window.setColor(super.getColor());
        window.fillOval(super.getxPos(),super.getyPos(),super.getWidth(),super.getHeight());
        //draw the ball at its new location
    }

 
    public boolean Equals(Object obj) {
        Ball temp = (Ball) obj;
        return super.equals(obj)&&XSpeed==temp.getXSpeed()&&YSpeed==temp.getYSpeed();
        //return false;
//return this.getxPos() == temp.getxPos() && this.getyPos() == temp.getyPos() && this.getWidth() == temp.getWidth() && this.getHeight() == temp.getHeight();

    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
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
    
    public boolean collidesX(Paddle paddle){
        if(this.getyPos()>paddle.getyPos()-this.getHeight()&&this.getyPos()<paddle.getyPos()+paddle.getHeight()){//check y
            if(this.getXSpeed()<0&&this.getxPos()<paddle.getyPos()+paddle.getWidth())
                return true;
        }
        return false;
    }
    
    @Override
    public String toString() {
        return "" + getxPos() + " " + getyPos() + " " + getWidth() + " " + getHeight() + " " + getColor() + " " + getXSpeed()+ " " + getYSpeed();
    }
}
