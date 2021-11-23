package org.math;

public class palindrome {
	public static void main(String[] args) {
		int num=559;
		int i=0,sum=0,a=num;
		while(a>0){
			i=a%10;
			sum=sum+i;
			a=a/10;
			
		}
		System.out.println(sum);
		
		
		
	}

}
