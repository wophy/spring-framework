package org.springframework.test;

import org.springframework.stereotype.Component;

/**
 * @author wophy
 * @description: TODO
 * @date 2022/11/2 15:19
 */
@Component
public class TestB {

	private TestA testA;

	public TestB(TestA testA) {
		this.testA = testA;
	}

}
