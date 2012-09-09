package com.socklabs.lazyexamples;

/**
 * Created with IntelliJ IDEA.
 * User: ngerakines
 * Date: 9/9/12
 * Time: 12:59 PM
 * To change this template use File | Settings | File Templates.
 */
public class Baz {

	private static long count;

	public Baz() {
		count += 1;
	}

	public long getCount() {
		return count;
	}

}
