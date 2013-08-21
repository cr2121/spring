package cn.amumu.spring.orm;

public class Student implements java.io.Serializable {

	private static final long serialVersionUID = -8425430450416253627L;

	private Long id;
	private String name;
	private Integer age;
	
	public Student(){
	}

	public Student(String name, Integer age) {
		this.name = name;
		this.age = age;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
}
