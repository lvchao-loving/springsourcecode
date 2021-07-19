package test.lvchao.applicationlistener;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @Title: MyApplicationListener
 * @Package: test.lvchao.applicationlistener
 * @Description:
 * @auther: chao.lv
 * @date: 2021/7/19 0:14
 * @version: V1.0
 */
@Component
public class MyApplicationListener implements ApplicationListener<MyApplicationEvent> {

	@Override
	public void onApplicationEvent(MyApplicationEvent event) {
		System.out.println("收到事件：" + event);
	}
}
