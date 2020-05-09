package com.poc.nonblocking;

import java.util.function.Function;

public class Producer<T> {

	public Producer(Function<Producer<T> , Subscription> subscribeParam) {
		this._subscribe = subscribeParam;
	}

	private Function<Producer<T>,Subscription> _subscribe;

	public Subscription subscribe(Producer<T> observer) {
		return this._subscribe.apply(observer);
	}
}
