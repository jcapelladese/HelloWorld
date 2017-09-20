/**
 * 
 */
package org.escoladeltreball.helloworld;

/**
 * @author iaw47941842
 *
 */
public interface Utils {
	
	public abstract double frequencyPercentatge(int[] values, int n);	
	
	/*
	 * this method return the frequency of n in values
	 */
	public abstract int frequency(int[] values, int n);	
	/*
	 * This method return the smallest value in a integer array
	 */
	public abstract int findSmallest(int[] values);

	/*
	 * This method return the sum of values
	 */
	public abstract int sum(int[] values);
}
