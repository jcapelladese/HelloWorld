/**
 * 
 */
package org.escoladeltreball.helloworld;

/**
 * @author iaw47941842
 *
 */
public final class Main implements Utils {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//System.out.println("Hello World");
		int[] v = {2,3,4,1,4,4,3,2,1,5};
		int n = 4;
		//int num = ;
		Main main = new Main();
		System.out.println(main.findSmallest(v));
		System.out.println(main.sum(v));
		System.out.println(main.frequency(v, n));
		System.out.println(main.frequencyPercentatge(v, n) + "%");
	}
	
	/*
	 * (non-Javadoc)
	 * This method returns the smallets value from values
	 * @see org.escoladeltreball.helloworld.Utils#findSmallest(int[])
	 */
	@Override
	public int findSmallest(int[] values) {
		// TODO Auto-generated method stub		
		int smallestNum = values[0];
		
		for (int value : values) {
			if (value < smallestNum) {
				smallestNum = value;
			}		
		}
		
		return smallestNum;
	}
	
	/*
	 * (non-Javadoc)
	 * This method return the sum of values
	 * @see org.escoladeltreball.helloworld.Utils#sum(int[])
	 */
	@Override
	public int sum(int[] values) {
		// TODO Auto-generated method stub
		int totalSum = 0;
		for (int value: values) {
			totalSum = totalSum + value;
		}
		
		return totalSum;
	}
	
	/*
	 * (non-Javadoc)
	 * This method return the frequency of the n in values
	 * @see org.escoladeltreball.helloworld.Utils#frequency(int[], int)
	 */
	@Override
	public int frequency(int[] values, int n) {
		// TODO Auto-generated method stub
		int frequency = 0;
		for (int value : values) {
			if (value == n) {
				++frequency;
			}		
		}
		
		return frequency;
	}
	/*
	 * (non-Javadoc)
	 * @see org.escoladeltreball.helloworld.Utils#frequencyPercentage(int[], int)
	 */

	@Override
	public double frequencyPercentatge(int[] values, int n) {
		// TODO Auto-generated method stub
		int frequency = 0;
		double percentatge;
		for (int value : values) {
			if (value == n) {
				++frequency;
			}		
		}
		percentatge = (double) frequency / values.length * 100;		
		return percentatge;
	}

}
