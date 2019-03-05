package revised;

public abstract class Shape {
	

	protected int height;
	protected boolean filled;
	protected String c="*";
	public Shape(int height ,boolean filled) {
		this.filled = filled;
		this.height = height;
	}
	public Shape(int height ,boolean filled,String c) {
		this.filled = filled;
		this.height = height;
		this.c = c;
	}
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

