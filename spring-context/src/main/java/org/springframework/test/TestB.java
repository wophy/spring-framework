package org.springframework.test;

import org.springframework.stereotype.Component;

/**
 * @author wophy
 * @description: TODO
 * @date 2022/11/2 15:19
 */
@Component
public class TestB {
	public TestA getTestA() {
		return testA;
	}

	public void setTestA(TestA testA) {
		this.testA = testA;
	}

	public TestB() {
	}
	private TestA testA;


}
