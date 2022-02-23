package com.kkk.prime;

public class PrimeNumber {
	private static void findPrime(int m) {
		int flag = 0;
		if(m==0&&m==1)
			System.out.println( "Not a Prime");
		for(int n=2;m>=n;n++) {
			if(m%n==0) 
				flag =1;
				break;			
		}
		
	
	if(flag==1) {
		System.out.println("Prime number");
	}else
	{
		System.out.println("Not a Prime");
	}
	}
	
	public static void main(String[] args) {
		PrimeNumber p = new PrimeNumber();
		p.findPrime(11);
		
		
		
	}

}
