package pong;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
import java.awt.Color;
import java.awt.Graphics;

public class Block implements Locatable {

    private int xPos;
    private int yPos;
    private int width = 10;
    private int height = 10;

    private Color color = Color.RED;

    public Block() {

    }

    public Block(int xPos, int yPos) {
        this.xPos = xPos;
        this.yPos = yPos;
    }

    public Block(int xPos, int yPos, int width, int height) {
        this.xPos = xPos;
        this.yPos = yPos;
        this.width = width;
        this.height = height;
    }

    public Block(int xPos, int yPos, int width, int height, Color color) {
        this.xPos = xPos;
        this.yPos = yPos;
        this.width = width;
        this.height = height;
        this.color = color;
    }

    //add other Block constructors - x , y , width, height, color
    //add the other set methods
    public void setColor(Color col) {

    }

    public void draw(Graphics window) {
        //uncomment after you write the set and get methods
        window.setColor(getColor());
        window.fillRect(getxPos(), getyPos(), getWidth(), getHeight());
    }

    public void draw(Graphics window, Color col) {
        window.fillRect(xPos, yPos, width, height);
    }

    public boolean equals(Block obj) {
        Block temp = (Block) obj;
        return this.getxPos() == temp.getxPos() && this.getyPos() == temp.getyPos() && this.getWidth() == temp.getWidth() && this.getHeight() == temp.getHeight() && this.getColor().equals(temp.getColor());
    }

    //add the other get methods
    //add a toString() method  - x , y , width, height, color
    @Override
    public void setPos(int x, int y) {
        setxPos(x);
        setyPos(y);
    }

    @Override
    public void setX(int x) {
        setxPos(x);
    }

    @Override
    public void setY(int y) {
        setyPos(y);
    }

    @Override
    public int getX() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getY() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getxPos() {
        return xPos;
    }

    public void setxPos(int xPos) {
        this.xPos = xPos;
    }

    public int getyPos() {
        return yPos;
    }

    public void setyPos(int yPos) {
        this.yPos = yPos;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Color getColor() {
        return color;
    }

}
