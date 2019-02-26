package Tuesday;

public class VerTri {
	private int height;
	private int type;

	public VerTri(int height, int type) {
		this.height = height;
		this.type = type;
	}
	public void draw() {
		switch (type) {
		case 1:
			for (int i = 1; i <= height; i++) {
				prchar("*", i);
				System.out.println();
			}
			break;
		case 2:
			for (int i = 1; i <= height; i++) {
				prchar(" ",height-i);
				prchar("*", i);
				System.out.println();
			}
			break;
		case 3:
			for (int i = 0; i <= height-1; i++) {
				prchar("*", height-i);
				System.out.println();
			}
			break;
		case 4:
			for (int i = 0; i <= height - 1; i++) {
				prchar(" ", i);
				prchar("*", height - i);
				System.out.println();
			}break;
		}
	}
	void prchar(String c, int n) {
		for (int i = 1; i <= n; i++)
			System.out.print(c);
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
}
