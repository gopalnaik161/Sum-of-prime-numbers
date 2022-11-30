package loogical;

public class C {
	public static boolean Primenumber(int num) {
		int count =0;
		
		
		for(int i= 1; i<=num; i++) {
			if(num%i==0) {
				count++;	
			}
		}
		if(count==2) {
          
        	return true;
		}else {
			return false;
		}
	}
	public static int addPrime( int number )  
	{  
    int min =1;
	int sum = 0;  
	
	for (int i = number; i >= min; i--)   
	{  
	boolean prime = Primenumber(i);  
	if (prime)   
	{  
	sum = sum + i;  
	}   
	}  
	 
	return sum;  
	}
	
	public static void main(String[] args) {
		System.out.println(addPrime(10));
	}
	
}
