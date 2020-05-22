package ar.com.marcelogore.sandbox.primes;

public class DoubleStepPrimeFinder implements PrimeFinder {

	@Override
	public boolean isPrime(int number) {
		
		boolean isPrime = true;

		if (number < 2) {
			
			isPrime = false;
		}
		
		if (number > 2 && number % 2 == 0) {
			
			isPrime = false;
		}
		
		for (int i = 3; i <= Math.sqrt(number); i = i + 2) {

			if (number != i && number % i == 0) {
				
				isPrime = false;
				break;
			}
		}

		return isPrime;
	}
	
}
