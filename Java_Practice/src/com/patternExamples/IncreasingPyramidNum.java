package com.patternExamples;



class ReversePyramid{
	
	public static void main(String[] args) {
		
		int n=6;
		for(int i=n;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}



public class IncreasingPyramidNum {
	
	public static void main(String[] args) {
		
		int n=6;
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
