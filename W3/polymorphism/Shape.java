package polymorphism;

public abstract class Shape {
	

	protected int height;
	
	public Shape(int h) {
		height = h;
	}

	public Shape() {
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	public abstract void draw();
	}

