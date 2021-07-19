package test.lvchao.applicationlistener;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * @Title: AnnotationApplicationEvent
 * @Package: test.lvchao.applicationlistener
 * @Description:
 * @auther: chao.lv
 * @date: 2021/7/19 8:10
 * @version: V1.0
 */
@Component
public class AnnotationApplicationEvent {
	@EventListener(classes = {ApplicationEvent.class,MyApplicationEvent.class})
	public void listen(ApplicationEvent applicationEvent){
		System.out.println("AnnotationApplicationEvent...listen..." + applicationEvent);
	}
}
