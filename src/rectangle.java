public class rectangle {
	public int length;
	public int width;
	public rectangle(int length, int width){
		this.width=width;
		this.length=length;
	}

	public int gitarea() {
		return length*width;
	}
	public int getperimeter() {
 		return 2*(length+width);
	}
}
