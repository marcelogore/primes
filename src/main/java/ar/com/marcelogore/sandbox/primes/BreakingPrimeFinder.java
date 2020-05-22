package ar.com.marcelogore.sandbox.primes;

public class BreakingPrimeFinder implements PrimeFinder {

	@Override
	public boolean isPrime(int number) {
		
		boolean isPrime = true;

		if (number < 2) {
			
			isPrime = false;
		}
		
		for (int i = 2; i < number; i++) {

			if (number % i == 0) {
				
				isPrime = false;
				break;
			}
		}

		return isPrime;
	}
	
}
