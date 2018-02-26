package orderedStructures;

public class Fibonacci extends Progression {

	private double prev; 
	
	public Fibonacci() { 
		this(1); 
		prev = 0; 
		firstIs=false;
	}
	private Fibonacci(double first) {
		super(first);
	}

	@Override
	public double nextValue() throws IllegalStateException  {
       if (!firstIs){ 
			throw new  IllegalStateException(" IllegalStateException:firstValue() have not been executed previously. ");
		}
		
	current = prev+current;
	prev = current-prev;
  
		return current;
	}
	
	@Override	
	public double firstValue() { 
		double value = super.firstValue(); 
		prev = 0; 
		return value; 
	}

}
