package com.socklabs.lazyexamples;

/**
 * Created with IntelliJ IDEA.
 * User: ngerakines
 * Date: 9/9/12
 * Time: 12:58 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class LazyData<O, R> {

	private volatile boolean executed = false;
	private R response = null;

	public abstract R responseData(O object);

	public R get(O object) {
		// NKG: Could probably do a check of executed == false outside of this sync block to quickly return to optimize
		// for cases where the method is called more than once or is long-lived.
		synchronized (this) {
			if (executed == false) {
				response = responseData(object);
				executed = true;
			}
		}
		return response;
	}

}
