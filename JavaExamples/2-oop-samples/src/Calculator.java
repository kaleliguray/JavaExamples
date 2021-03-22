
public class Calculator {

	int plus(int x, int y) {
		return x + y;
	}
	
	void plus(int x) {
		int total =  x + x;
	}

	float plus(float x, int y) {
		return x + y;
	}

	float plus(int x, float y) {
		return x + y;
	}

	int plus(int x, int y, int z) {
		return x + y + z;
	}

	int minus(int x, int y) {
		int total = x - y;
		return total;
	}

	float division(float x, int y) {
		return x / y;
	}

	float division(int y, float x) {
		return y / x;
	}

}

// S.O.L.I.D
// Single Responsibility