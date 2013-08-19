package cn.amumu.spring.orm;

public class Student implements java.io.Serializable {

	private Integer id;
	private String name;
	private Integer age;

	public Student() {
	}

	public Student(String name) {
		this.name = name;
	}

	public Student(String name, Integer age) {
		this.name = name;
		this.age = age;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return this.age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
}
