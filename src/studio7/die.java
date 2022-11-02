package studio7;

public class die {

	private int n;
	
	
	//constructor
	public die(int sides)  {
		n=sides;
	}
	
	public int thrown() {
		//System.out.println(n);
		return 1+(int)(Math.random()*n);
		
	}


public static void main(String[] args) {
	die d1 = new die(5);
    System.out.println("number: " + d1.thrown());
    die d2 = new die(6);
    System.out.println("number: " + d2.thrown());
}
}