class Area
{
	final static double pi=3.142;     //final keywaod
static void circle(int redius)
{
	double area=pi*redius*redius;
	System.out.println("The area of circle :"+area);
	
}

static void ellipse(int minar_axis,int major_axis)
{
	double area=pi*minar_axis*major_axis;
	System.out.println("The area of ellipse :"+area);
	
}

static void circle_circum(int redius)
{
	double circumference=2*pi*redius;
	System.out.println("The circumference of circle :"+circumference);
	
}



public static void main(String []args)
{
	circle(10);
	ellipse(10,20);
	circle_circum(8);
}
}