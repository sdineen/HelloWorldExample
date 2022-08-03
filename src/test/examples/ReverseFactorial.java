package test.examples;

public class ReverseFactorial {

	public int getValue(long num) {
		
        for (int i = 2; num%i == 0; num/=i,i ++) {
            if (num / i == 1) return i;
        }
        System.out.println("NONE");
        return 0;
        
        
//		int divisor = 1;
//		while (factorial != 1 && factorial >0) {			
//			divisor++;	
//			factorial = factorial / divisor;
//			
//		}
//		return divisor;
		
	}

}
