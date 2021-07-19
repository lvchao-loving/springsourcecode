package test.lvchao.beanfactorypostprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @Title: MyBeanFactoryPostProcessor
 * @Package: test.lvchao.beanfactorypostprocessor
 * @Description:
 * @auther: chao.lv
 * @date: 2021/7/18 22:18
 * @version: V1.0
 */
@Component
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		String[] beanDefinitionNames = beanFactory.getBeanDefinitionNames();
		System.out.println("--------------------------------------");
		System.out.println(Arrays.asList(beanDefinitionNames));
		System.out.println("--------------------------------------");
	}
}
