package com.poc.nonblocking;

import java.util.Arrays;

public class NonBlockingImpl {

	public static void main(String...args){

		final Producer<Integer> producer = new Producer<>(
				observer -> {
					Arrays.asList(1,2,3)
					.stream()
					.forEach(integer -> observer.onNext(integer));

					return () -> System.out.println("unsubscribe or stop from array or data source");
				});



		final Subscription subscription = producer.subscribe(new Observer<Integer>() {
			@Override
			public void onNext(Integer integer) {
				System.out.println(integer);
			}

			@Override
			public void onError(Integer error) {

			}

			@Override
			public void onComplete() {

			}
		});

	}
}
