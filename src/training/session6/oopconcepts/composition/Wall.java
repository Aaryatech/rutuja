package training.session6.oopconcepts.composition;

public class Wall {
private String direction;

public String getDirection() {
	return direction;
}

public void setDirection(String direction) {
	this.direction = direction;
}

public Wall(String direction) {
	super();
	this.direction = direction;
}

}
