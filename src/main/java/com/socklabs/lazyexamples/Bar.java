package com.socklabs.lazyexamples;

/**
 * Created with IntelliJ IDEA.
 * User: ngerakines
 * Date: 9/9/12
 * Time: 12:57 PM
 * To change this template use File | Settings | File Templates.
 */
public class Bar {

	private static long count;

	public Bar() {
		count += 1;
	}

	public long getCount() {
		return count;
	}

}
