// Java program to Demonstrate One Object to
// Initialize Another

// Class 1
class Box {
    Box() {

    }// Default Constructor

	double width, height, depth;

	// Notice this constructor. It takes an
	// object of type Box. This constructor use
	// one object to initialize another
	Box(Box ob)
	{
		width = ob.width;
		height = ob.height;
		depth = ob.depth;
	}// Constructor

	// constructor used when all dimensions
	// specified
	Box(double w, double h, double d)
	{
		width = w;
		height = h;
		depth = d;
	}// Constructor

	// compute and return volume
	double volume() { return width * height * depth; }
}// Box Class


