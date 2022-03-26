package training.session6.oopconcepts.composition;

public class Ceiling {
private int paintedcolor;
private int height;
public int getPaintedcolor() {
	return paintedcolor;
}
public void setPaintedcolor(int paintedcolor) {
	this.paintedcolor = paintedcolor;
}
public int getHeight() {
	return height;
}
public void setHeight(int height) {
	this.height = height;
}
public Ceiling(int paintedcolor, int height) {
	super();
	this.paintedcolor = paintedcolor;
	this.height = height;
}
}
