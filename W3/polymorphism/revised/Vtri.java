package revised;
public class Vtri extends Shape{

	private int type; // 1, 2, 3, 4
	final int UR=1;
	final int UL=2;
	final int DR=3;
	final int DL=4;


	public Vtri(int height, int type) {
		super(height);
		this.type = type;
	}
	public Vtri(int height, int type,boolean filled) {
		super(height,filled);
		this.type = type;
		
	}
	public Vtri(int height, int type,boolean filled,String c) {
		super(height,filled,c);
		this.type = type;
		
	}


	public int getType() {
		return type;
	}


	public void setType(int type) {
		this.type = type;
	}


	public void UR() {
		if(filled) { 
		for (int i = 1; i <= height; i++) {
			prchar(c, i);
			System.out.println();
		}
		}else {
			for(int i=1; i<=height;i++) {
				for(int j=1; j<=height;j++) {
					if(i==height || j==1 || i==j) 
					System.out.print(c);
					else 
					System.out.print(" ");
			}
			System.out.println();
		  }
		}
	}
	public void UL() {
		if(filled) {
			for (int i = 1; i <= height; i++) {
			prchar(" ", height - i);
			prchar("*", i);
			System.out.println();
		}
	}
		else {
			for(int i=1; i<=height;i++) {
				for(int j=1; j<=height;j++) {
					if(i==height || j==height || i+j==height+1) 
					System.out.print(c);
					else 
					System.out.print(" ");
			}
			System.out.println();
			}
	 }
	}
	public void DR() {
		if(filled) {
			for (int i = 1; i <= height; i++) {
		
			prchar("*", height - i + 1);
			System.out.println();
		}
	}else {
		for(int i=1; i<=height;i++) {
	
		for(int j=1; j<=height;j++) {
			if(i==1 || j==1 || i+j==height+1) 
			System.out.print(c);
			else 
			System.out.print(" ");
			}
	System.out.println();
		}
	}
}
	public void DL() {
		if(filled) {
			for (int i = 1; i <= height; i++) {
		
			prchar(" ", i - 1);
			prchar("*", height - i + 1);
			System.out.println();
		}
	}else {
		for(int i=1; i<=height;i++) {
			for(int j=1; j<=height;j++) {
				if(i==1 || j==height || i==j) 
				System.out.print(c);
				else 
				System.out.print(" ");
		}
		System.out.println();
		}
	}
		
	}
	
	public void draw() {
		switch (type) {
		case 1:
			UR();
			break;
		case 2:
			UL();
			break;
		case 3:
			DR();

			break;
		case 4:
			DL();
			
			break;
		}
	}
	/*@Override
	public String toString() {
		return String.format("Height= %d; type= %d; filled= %d; char=%s",height,type,filled,c);
	}*/
	
	void prchar(String c, int n) {
		for (int i = 1; i <= n; i++)
			System.out.print(c);
	}
	@Override
	public String toString() {
		return "Vtri [type=" + type + ", height=" + height + ", filled=" + filled + ", c=" + c + "]";
	}

}
