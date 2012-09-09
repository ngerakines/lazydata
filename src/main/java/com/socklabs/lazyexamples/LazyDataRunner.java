package com.socklabs.lazyexamples;

/**
 * Created with IntelliJ IDEA.
 * User: ngerakines
 * Date: 9/9/12
 * Time: 1:02 PM
 * To change this template use File | Settings | File Templates.
 */
public class LazyDataRunner<O, R> {

	private volatile boolean executed = false;
	private R response = null;

	public R get(LazyDataInterface<O, R> lazyData, O object) {
		synchronized (this) {
			if (executed == false) {
				response = lazyData.get(object);
				executed = true;
			}
		}
		return response;
	}

}
