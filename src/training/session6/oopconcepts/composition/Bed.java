package training.session6.oopconcepts.composition;

public class Bed {
private String style;
private int pillows;
private int height;
private int sheets;
private int quilt;
public String getStyle() {
	return style;
}
public void setStyle(String style) {
	this.style = style;
}
public int getPillows() {
	return pillows;
}
public void setPillows(int pillows) {
	this.pillows = pillows;
}
public int getHeight() {
	return height;
}
public void setHeight(int height) {
	this.height = height;
}
public int getSheets() {
	return sheets;
}
public void setSheets(int sheets) {
	this.sheets = sheets;
}
public int getQuilt() {
	return quilt;
}
public void setQuilt(int quilt) {
	this.quilt = quilt;
}
void make()
{
	System.out.println("Bed -> bed is making");
}
public Bed(String style, int pillows, int height, int sheets, int quilt) {
	super();
	this.style = style;
	this.pillows = pillows;
	this.height = height;
	this.sheets = sheets;
	this.quilt = quilt;
}


}
