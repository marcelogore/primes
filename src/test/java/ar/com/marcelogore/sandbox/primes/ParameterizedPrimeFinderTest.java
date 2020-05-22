package ar.com.marcelogore.sandbox.primes;

import java.util.ArrayList;
import java.util.Collection;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ParameterizedPrimeFinderTest {

	private int inputPrime;
	private boolean expectedResult;
	
	private PrimeFinder finder = null;

	public ParameterizedPrimeFinderTest(int inputPrime, boolean expectedResult) {

		this.inputPrime = inputPrime;
		this.expectedResult = expectedResult;
	}
	
	@Parameters(name = "Is {0} prime? {1}")
	public static Collection<Object[]> data() {

		Collection<Object[]> params = new ArrayList<>();
		
		for (int i = 1; i <= Prime.NUMBERS.get(Prime.NUMBERS.size() - 1); i++) {
			
			if (Prime.NUMBERS.contains(i)) {
				
				params.add(new Object[] {i, true});
				
			} else {
				
				params.add(new Object[] {i, false});
			}
		}
		
		return params;
	}
	
	@Test
	public void testSimpleFinder() {
		
		finder = new SimplePrimeFinder();
		Assert.assertThat(finder.isPrime(inputPrime), Matchers.is(expectedResult));
	}

	@Test
	public void testSquaredRootFinder() {
		
		finder = new SquaredRootPrimeFinder();
		Assert.assertThat(finder.isPrime(inputPrime), Matchers.is(expectedResult));
	}

	@Test
	public void testSquaredRootBreakingFinder() {
		
		finder = new SquaredRootBreakingPrimeFinder();
		Assert.assertThat(finder.isPrime(inputPrime), Matchers.is(expectedResult));
	}

	@Test
	public void testBreakingFinder() {
		
		finder = new BreakingPrimeFinder();
		Assert.assertThat(finder.isPrime(inputPrime), Matchers.is(expectedResult));
	}

	@Test
	public void testDoubleStepFinder() {
		
		finder = new DoubleStepPrimeFinder();
		Assert.assertThat(finder.isPrime(inputPrime), Matchers.is(expectedResult));
	}
}
