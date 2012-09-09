package com.socklabs.lazyexamples;

/**
 * Created with IntelliJ IDEA.
 * User: ngerakines
 * Date: 9/9/12
 * Time: 1:05 PM
 * To change this template use File | Settings | File Templates.
 */
public class Qux {

	private static long count;

	public Qux() {
		count += 1;
	}

	public long getCount() {
		return count;
	}

}
