public class GFGBoX extends Box {
	// Main driver method
	public static void main(String args[])
	{
		// Creating a box with all dimensions specified
		Box mybox = new Box(10, 20, 15);

		// Creating a copy of mybox
		Box myclone = new Box(mybox);
        // So I can make clones of objects
        // This could be useful since the hop counts need to be updated for every move
        // I just need to make sure the updated hop counts are cloned at every fork

		double vol;

		// Get volume of mybox
		vol = mybox.volume();
		System.out.println("Volume of mybox is " + vol);

		// Get volume of myclone
		vol = myclone.volume();
		System.out.println("Volume of myclone is " + vol);
	}// Main
}// GFGBoX Class

