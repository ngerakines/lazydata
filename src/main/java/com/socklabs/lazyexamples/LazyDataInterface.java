package com.socklabs.lazyexamples;

/**
 * Created with IntelliJ IDEA.
 * User: ngerakines
 * Date: 9/9/12
 * Time: 1:04 PM
 * To change this template use File | Settings | File Templates.
 */
public interface LazyDataInterface<O, R> {

	public R get(O object);

}
