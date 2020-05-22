package ar.com.marcelogore.sandbox.primes;

public class PrimePrinter {

	private PrimeFinder finder;
	
	public PrimePrinter(PrimeFinder finder) {
		
		setFinder(finder);
	}
	
	public void setFinder(PrimeFinder finder) {
		
		this.finder = finder;
	}
	
	public void printUpTo(int upTo) {
		
		long startTime = System.nanoTime();
		
		final int maxCharsPerLine = 80;
		int charsInThisLine = 0;
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 1; i < upTo; i++) {

			if (finder.isPrime(i)) {
				
				sb.append(i);
				sb.append(", ");
			}
			
			charsInThisLine = sb.length() - sb.lastIndexOf("\n");
			
			if (charsInThisLine >= maxCharsPerLine) {
				
				sb.append("\n");
				charsInThisLine = 0;
			}
		}
		
		long endTime = System.nanoTime();
		
		System.out.println(upTo + ";" + (endTime - startTime) / 1000000d);
	}
	
	public static void main(String[] args) {
		
		PrimeFinder simpleFinder = new SimplePrimeFinder();
		PrimeFinder breakingFinder = new BreakingPrimeFinder();
		PrimeFinder doubleStepFinder = new DoubleStepPrimeFinder();
		PrimeFinder sqrtFinder = new SquaredRootPrimeFinder();
		PrimeFinder breakingSqrtFinder = new SquaredRootBreakingPrimeFinder();
		PrimePrinter printer = new PrimePrinter(simpleFinder);
		
		System.out.println("Simple finder");
		
		printer.printUpTo(1);
		printer.printUpTo(10);
		printer.printUpTo(100);
		printer.printUpTo(1000);
		printer.printUpTo(10000);
		printer.printUpTo(100000);

		System.out.println("Breaking finder");
		printer.setFinder(breakingFinder);
		
		printer.printUpTo(1);
		printer.printUpTo(10);
		printer.printUpTo(100);
		printer.printUpTo(1000);
		printer.printUpTo(10000);
		printer.printUpTo(100000);

		System.out.println("Double step finder");
		printer.setFinder(doubleStepFinder);
		
		printer.printUpTo(1);
		printer.printUpTo(10);
		printer.printUpTo(100);
		printer.printUpTo(1000);
		printer.printUpTo(10000);
		printer.printUpTo(100000);

		System.out.println("Squared root finder");
		printer.setFinder(sqrtFinder);
		
		printer.printUpTo(1);
		printer.printUpTo(10);
		printer.printUpTo(100);
		printer.printUpTo(1000);
		printer.printUpTo(10000);
		printer.printUpTo(100000);
		printer.printUpTo(1000000);

		System.out.println("Squared root breaking finder");
		printer.setFinder(breakingSqrtFinder);
		
		printer.printUpTo(1);
		printer.printUpTo(10);
		printer.printUpTo(100);
		printer.printUpTo(1000);
		printer.printUpTo(10000);
		printer.printUpTo(100000);
		printer.printUpTo(1000000);
		printer.printUpTo(10000000);
    }
}
