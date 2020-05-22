package ar.com.marcelogore.sandbox.primes;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;

public class PrimeFinderTest {

	@Test
	public void shouldBePrimeIfNomberIs1() {
		
		PrimeFinder finder = new SimplePrimeFinder();
		boolean isPrime = finder.isPrime(1);
		Assert.assertThat(isPrime, Matchers.is(true));
	}
	
	
	@Test
	public void shouldBePrimeIfNomberIs2() {
		
		PrimeFinder finder = new SimplePrimeFinder();
		boolean isPrime = finder.isPrime(1);
		Assert.assertThat(isPrime, Matchers.is(true));
	}
	
	@Test
	public void shouldBePrimeIfNomberIs3() {
		
		PrimeFinder finder = new SimplePrimeFinder();
		boolean isPrime = finder.isPrime(1);
		Assert.assertThat(isPrime, Matchers.is(true));
	}
	
	@Test
	public void shouldBePrimeIfNomberIs7() {
		
		PrimeFinder finder = new SimplePrimeFinder();
		boolean isPrime = finder.isPrime(7);
		Assert.assertThat(isPrime, Matchers.is(true));
	}

	@Test
	public void shouldNotBePrimeIfNomberIsEven() {
		
		Integer evenNumber = 4;
		PrimeFinder finder = new SimplePrimeFinder();
		boolean isPrime = finder.isPrime(evenNumber);
		Assert.assertThat(isPrime, Matchers.is(false));
	}
}
