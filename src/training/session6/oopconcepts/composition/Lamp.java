package training.session6.oopconcepts.composition;

public class Lamp {
 private String style;
 private boolean battery;
 private int globrating;
public Lamp(String style,boolean battery,int globrating) {
	//super();
	this.style= style;
	this.battery = battery;
	this.globrating = globrating;
	// TODO Auto-generated constructor stub
}
public String getStyle() {
	return style;
}
public void setStyle(String style) {
	this.style = style;
}
public boolean isBattery() {
	return battery;
}
public void setBattery(boolean battery) {
	this.battery = battery;
}
public int getGlobrating() {
	return globrating;
}
public void setGlobrating(int globrating) {
	this.globrating = globrating;
}
void turnOn()
{
	System.out.println("lamp -> turn on");
}

}
