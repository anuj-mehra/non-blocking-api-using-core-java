package com.poc.nonblocking;

public interface Observer<T> {

	// will be called by producer when there is data.
	void onNext(T integer);

	// will be called by producer when there is error.
	void onError(T error);

	// will be called by consumer when producer has no more data and its complete
	void onComplete();
}
