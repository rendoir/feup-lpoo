package dk.logic;

public class Coordinates implements java.io.Serializable {
	private int x;
	private int y;
	
	//Constructors
	public Coordinates(int x, int y){
		this.x = x;
		this.y = y;
	}
	public Coordinates(){
		this.x = 0;
		this.y = 0;
	}
	
	public Coordinates(Coordinates c) {
		x = c.x;
		y = c.y;
	}
	
	
	//Gets
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	//Sets
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	@Override
	public boolean equals(Object o){
		return x == ((Coordinates) o).x && y == ((Coordinates) o).y;
	}
	
}
