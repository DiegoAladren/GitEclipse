package git;

public class Clase3 {
	
	int c;
	public int multiplicacion() {
		int n;
		n=c*2;
		return n;
	}
	

	public int módulo() {
		int n;
		n=c%2;
		return n;
	}
	public boolean esPrimo(int n) {
	    if (n <= 1) {
	        return false;
	    }
	    for (int i = 2; i <= Math.sqrt(n); i++) {
	        if (n % i == 0) {
	            return false;
	        }
	    }
	    return true;
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
