package test.lvchao;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import test.lvchao.applicationlistener.MyApplicationEvent;
import test.lvchao.config.CustomConfig;

/**
 * @Title: Test01
 * @Package: test.lvchao
 * @Description:
 * @auther: chao.lv
 * @date: 2021/7/18 16:14
 * @version: V1.0
 */
public class TestApplication {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(CustomConfig.class);
		applicationContext.publishEvent(new MyApplicationEvent("自定义事件发送"));
	}
	/*public static void main(String[] args) {
		// System.out.println(Charset.defaultCharset()); // 查看项目默认编码格式
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(CustomConfig.class);
		String[] beanDefinitionNames = annotationConfigApplicationContext.getBeanDefinitionNames();
		Stream.of(beanDefinitionNames).forEach(System.out::println);
		annotationConfigApplicationContext.close();
	}*/
}
