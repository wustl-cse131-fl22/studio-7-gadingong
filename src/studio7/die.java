package studio7;

public class die {

	private int n;
	
	
	//constructor
	public die(int sides)  {
		n=sides;
	}
	
	public int thrown(int sides) {
		return 1+(int) Math.random()*n;
	}
}
