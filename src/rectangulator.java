public class rectangulator {
	public static void main (String[] args){
		int length=Integer.parseInt(args[0]);
		int width=Integer.parseInt(args[1]);
		rectangle myRectangle=new rectangle(length,width);
		String output=String.format("*** your rectangle ***\n\nLength: %d\nWidth: %d\nArea: %d\nPermiter: %d\n\n", myRectangle.length, myRectangle.width, myRectangle.getarea(), myRectangle.getperimeter());
		System.out.println(output);
	}
}

