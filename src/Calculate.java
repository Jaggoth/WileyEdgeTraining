
public class Calculate {
	
	private int x;
	private int y;

	public Calculate(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int multiply() {
		int z = x * y;
		return z;
	
	}

	public int add() {
		int z = x + y;
		return z;
	
	}
}
