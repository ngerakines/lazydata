package com.socklabs.lazyexamples;

/**
 * Created with IntelliJ IDEA.
 * User: ngerakines
 * Date: 9/9/12
 * Time: 12:57 PM
 * To change this template use File | Settings | File Templates.
 */
public class Foo {

	private Bar bar = null;

	private LazyData<Foo, Baz> bazLazyData = new LazyData<Foo, Baz>() {
		@Override
		public Baz responseData(Foo object) {
			return new Baz();
		}
	};

	private LazyDataRunner<Foo, Qux> quxLazyDataRunner = new LazyDataRunner<Foo, Qux>();

	public Bar getBar() {
		if (bar == null) {
			bar = new Bar();
		}
		return bar;
	}

	public Baz getBaz() {
		return this.bazLazyData.get(this);
	}

	public Qux getQux() {
		return this.quxLazyDataRunner.get(quxLazyDataLoader, this);
	}

	private static final LazyDataInterface<Foo, Qux> quxLazyDataLoader = new LazyDataInterface<Foo, Qux>() {
		@Override
		public Qux get(Foo object) {
			return new Qux();
		}
	};

	public static void main(String[] args) throws InterruptedException {
		Foo foo = new Foo();
		System.out.println(foo.getBar().getCount()); // 1
		System.out.println(foo.getBar().getCount()); // 1
		System.out.println(foo.getBaz().getCount()); // 1
		System.out.println(foo.getBaz().getCount()); // 1
		System.out.println(foo.getBaz().getCount()); // 1
		System.out.println(foo.getQux().getCount()); // 1
		System.out.println(foo.getQux().getCount()); // 1
		System.out.println(foo.getQux().getCount()); // 1
	}

}
