
public class Tally {

	int t;
	
	public Tally() {
		t = 0;
	}
	
	public int getTally() {
		return t;
	}
	
	public void inc() {
		t++; // t = t + 1
	}
	
	public void inc(int n) {
		t += n; // t = t + n
	}
	
	public void safeInc() throws ArithmeticException {
		int temp = t;
		temp++;
		if ( temp <= t ) {
			throw new ArithmeticException("Incremented beyond max value");
		}
		t = temp;
	}
}
