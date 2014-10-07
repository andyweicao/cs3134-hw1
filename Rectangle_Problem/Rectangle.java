import java.util.*;

public class Rectangle{
	private int width;
	private int height;
	
	public int getWidth(){
		return width;
	}
	
	public void setWidth(int w){
		width = w;
	}
	
	public int getHeight(){
		return height;
	}
	
	public void setHeight(int h){
		height = h;
	}
	
	public int getArea(){
		return width*height;
	}
	
	public int getPerimeter(){
		return 2*(width+height);
	}
	
	public String toString(){
		String name;
		name = "Rectangle with width of " + width;
		name = name + " and height of " + height;
		return name;
	}

}