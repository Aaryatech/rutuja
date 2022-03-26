package training.session6.oopconcepts.composition;

public class Bedroom {
 Wall wall1,wall2,wall3,wall4;
 Ceiling ceiling;
 Bed bed;
 Lamp lamp;
public  Wall getWall1() {
	return wall1;
}
public void setWall1(Wall wall1) {
	this.wall1 = wall1;
}
public Wall getWall2() {
	return wall2;
}
public void setWall2(Wall wall2) {
	this.wall2 = wall2;
}
public Wall getWall3() {
	return wall3;
}
public void setWall3(Wall wall3) {
	this.wall3 = wall3;
}
public Wall getWall4() {
	return wall4;
}
public void setWall4(Wall wall4) {
	this.wall4 = wall4;
}
public Ceiling getCeiling() {
	return ceiling;
}
public void setCeiling(Ceiling ceiling) {
	this.ceiling = ceiling;
}
public Bed getBed() {
	return bed;
}
public void setBed(Bed bed) {
	this.bed = bed;
}
public Lamp getLamp() {
	return lamp;
}
public void setLamp(Lamp lamp) {
	this.lamp = lamp;
}
public void makeBed()
{
   System.out.println("bed is being made");
}
public Bedroom(Wall wall1, Wall wall2, Wall wall3, Wall wall4, Ceiling ceiling, Bed bed, Lamp lamp) {
	super();
	this.wall1 = wall1;
	this.wall2 = wall2;
	this.wall3 = wall3;
	this.wall4 = wall4;
	this.ceiling = ceiling;
	this.bed = bed;
	this.lamp = lamp;
}
public static void main(String[] args) {
	Wall wall1 = new Wall("west");
	Wall wall2 = new Wall("East");
	Wall wall3 = new Wall("South");
	Wall wall4 = new Wall("North");

	
}
}
