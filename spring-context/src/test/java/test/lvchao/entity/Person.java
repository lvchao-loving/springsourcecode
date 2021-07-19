package test.lvchao.entity;


/**
 * @Title: Person
 * @Package: test.lvchao.entity
 * @Description:
 * @auther: chao.lv
 * @date: 2021/7/18 23:24
 * @version: V1.0
 */
public class Person {

	private String name;
	private Integer age;

	public String getName() {
		return name;
	}

	public Integer getAge() {
		return age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person{" +
				"name='" + name + '\'' +
				", age=" + age +
				'}';
	}
}
