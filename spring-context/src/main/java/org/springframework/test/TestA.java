package org.springframework.test;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @author wophy
 * @description: TODO
 * @date 2022/11/2 15:19
 */
@Component
public class TestA implements ApplicationContextAware, BeanFactoryAware {
	private TestB testB;

//	@Value("${value:123}")

	public TestA() {
	}
//	private String testVue;

	public void init(){
		System.out.println(" 执行了  init ");
	}

	public void destroy(){
		System.out.println(" 执行了  destroy ");
	}

	public TestB getTestB() {
		return testB;
	}

	public void setTestB(TestB testB) {
		System.out.println("调用了serTestB:  "+testB);
		this.testB = testB;
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("实现 ApplicationContextAware 后 执行 setApplicationContext");
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("实现 BeanFactoryAware 后 执行 setBeanFactory");

	}
}
