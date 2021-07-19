package test.lvchao.applicationlistener;

import org.springframework.context.ApplicationEvent;

import java.io.Serializable;
import java.time.Clock;

/**
 * @Title: MyApplicationEvent
 * @Package: test.lvchao.applicationlistener
 * @Description:
 * @auther: chao.lv
 * @date: 2021/7/19 0:38
 * @version: V1.0
 */
public class MyApplicationEvent extends ApplicationEvent implements Serializable {

	private static final long serialVersionUID = 1L;

	public MyApplicationEvent(Object source) {
		super(source);
	}
}
