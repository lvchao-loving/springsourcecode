package test.lvchao.beanfactorypostprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.*;
import org.springframework.stereotype.Component;
import test.lvchao.entity.Person;

/**
 * @Title: MyBeanDefinitionRegistryPostProcessor
 * @Package: test.lvchao.beanfactorypostprocessor
 * @Description:
 * @auther: chao.lv
 * @date: 2021/7/18 23:20
 * @version: V1.0
 */
@Component
public class MyBeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("MyBeanDefinitionRegistryPostProcessor...postProcessBeanFactory...bean的数量：" + beanFactory.getBeanDefinitionCount());
	}

	@Override
	public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
		System.out.println("MyBeanDefinitionRegistryPostProcessor...postProcessBeanDefinitionRegistry...bean的数量：" + registry.getBeanDefinitionCount());
		// 自定义 beandefinition
		// 方式 1
		/*RootBeanDefinition rootBeanDefinition = new RootBeanDefinition(Person.class);
		registry.registerBeanDefinition("person",rootBeanDefinition);*/
		// 方式 2
		AbstractBeanDefinition beanDefinition = BeanDefinitionBuilder.rootBeanDefinition(Person.class).getBeanDefinition();
		registry.registerBeanDefinition("person",beanDefinition);
	}
}
