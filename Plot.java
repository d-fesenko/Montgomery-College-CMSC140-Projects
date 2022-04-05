
public class Plot {
	
private int x;
private int y;
private int depth;
private int width;

public Plot() {
	x = 0;
	y = 0;
	depth = 1;
	width = 1;
}

public Plot(int x, int y, int depth, int width) {
	x = this.x;
	y = this.y;
	depth = this.depth;
	width = this.width;
}

public boolean overlaps(Plot p1) {
	boolean overlaps = true;
	if(p1.x < x && p1.x > (x+width) || p1.y < y && p1.y > (y+depth)) {
		overlaps = false;
	}
	return overlaps;
}

public boolean encompasses(Plot p1) {
	boolean encompasses = false;
	if(x <= p1.getX() && (x + width) >= (p1.getX() + p1.getWidth()) && y <= p1.getY() && (y + depth) >= (p1.getY() + p1.getDepth())) {
		encompasses = true;
	}
	return encompasses;
}

public String toString() {
	return("Upper Left: (" + x + "," + y + ") Width: " + width + " Depth: " + depth);
}

public void setX(int x) {
	x = this.x;
}

public int getX() {
	return x;
}

public void setY(int y) {
	y = this.y;
}

public int getY() {
	return y;
}

public void setWidth(int width) {
	width = this.width;
}

public int getWidth() {
	return width;
}

public void setDepth(int depth) {
	depth = this.depth;
}

public int getDepth() {
	return depth;
}
}
