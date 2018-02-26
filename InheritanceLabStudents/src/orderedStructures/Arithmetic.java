package orderedStructures;

public class Arithmetic extends Progression {
	private double commonDifference; 
	
	public Arithmetic(double firstValue, double commonDifference) { 
		super(firstValue); 
		this.commonDifference = commonDifference; 
		firstIs=false;
	}
	
	@Override
	public double nextValue() throws IllegalStateException  {
		if (!firstIs){ 
			throw new  IllegalStateException(" IllegalStateException:firstValue() have not been executed previously. ");
		}
			current = current + commonDifference; 
		return current;
	}
	@Override
	public String toString(){
				
	return "Geom("+ (int)firstValue()+ ","+(int)commonDifference+")";
		
	}
    @Override
	
	public double getTerm(int n) throws IndexOutOfBoundsException { 
		if (n <= 0) 
			throw new IndexOutOfBoundsException("printAllTerms: Invalid argument value = " + n); 

		
		return  (firstValue()) + (commonDifference)*(n-1);

	}

}
