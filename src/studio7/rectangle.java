package studio7;

public class rectangle {
	
	private double width;
	private double length;
	
	private double width2;
	private double length2;
	

	public rectangle(double width1, double length1, double width2, double length2)  {
		width=width1;
		length=length1;
		width2=width2;
		length2=length2;
	}
	
	
	//area
	public double area(double width,double length) {
		return width*length;
	}
	//perimeter
	
	public double perimeter(double width, double length) {
		return 2*(width+length);
	}
	
	//is square 
	public boolean square(double width, double length) {
		return width==length;
	}
	
	//is smaller or bigger 
	public String size(double width, double length, double width2,double length2) {
		double area1=width*length;
		double area2=length2*width2;
		if (area1>area2) {
			return "bigger";
		} else if (area1<area2) {
			return "smaller";
		} else {
			return "same";
		}
		
	}
	
}
