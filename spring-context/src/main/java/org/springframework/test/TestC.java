package org.springframework.test;

import org.springframework.stereotype.Component;

/**
 * @author wophy
 * @description: TODO
 * @date 2022/11/2 15:19
 */
@Component
public class TestC {
	public TestA getTestA() {
		return testA;
	}

	public void setTestA(TestA testA) {
		this.testA = testA;
	}

	public TestC() {
	}
	private TestA testA;

	public void init(){
		System.out.println(" 执行了  init ");
	}

	public void destroy(){
		System.out.println(" 执行了  destroy ");
	}
}
