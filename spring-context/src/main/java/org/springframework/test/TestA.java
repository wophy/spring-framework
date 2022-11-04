package org.springframework.test;

import org.springframework.stereotype.Component;

/**
 * @author wophy
 * @description: TODO
 * @date 2022/11/2 15:19
 */
@Component
public class TestA {
	private TestB testB;

	public TestA(TestB testB) {
		this.testB = testB;
	}
}
