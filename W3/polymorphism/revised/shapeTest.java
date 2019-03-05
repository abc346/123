package revised;
public abstract class shapeTest {

	public static void main(String[] args) {
		final int MAX = 100;
		Shape shapes[] = new Shape [MAX];
		int shapecount = 0;
		shapes[shapecount++] = new Rect(6,10,true);
		shapes[shapecount++] = new Rect(6,10,false,"#");
		shapes[shapecount++] = new Rect(8,8,false);
		shapes[shapecount++] = new Rect(8,8,true,"#");
		shapes[shapecount++] = new Vtri(5,1,true);
		shapes[shapecount++] = new Vtri(5,1,false);
		shapes[shapecount++] = new Vtri(5,1,true,"@");
		shapes[shapecount++] = new Vtri(5,1,false,"@");	
		
//		shapes[shapecount++] = new Vtri(5,2,false);
//		shapes[shapecount++] = new Vtri(5,3,true);
//		shapes[shapecount++] = new Vtri(5,4,false);
		for(int i=0;i<shapecount;i++) {
			shapes[i].draw();
			System.out.println(shapes[i]);
		}
	
	
	}

}
