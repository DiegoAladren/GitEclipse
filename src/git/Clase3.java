package git;

public class Clase3 {
	
	int c;
	public int multiplicacion() {
		int n;
		n=c*2;
		return n;
	}
	
	public int división() {
		int n;
		n=c/2;
		return n;
	}
	public int calcularFactorial(int n) {
	    if (n == 0) {
	        return 1;
	    } else {
	        return n * calcularFactorial(n - 1);
	    }
	}

}
