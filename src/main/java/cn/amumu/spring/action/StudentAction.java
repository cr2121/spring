package cn.amumu.spring.action;

import java.util.List;

import javax.annotation.Resource;

import cn.amumu.spring.orm.Student;
import cn.amumu.spring.service.StudentService;

import com.opensymphony.xwork2.ActionSupport;

public class StudentAction extends ActionSupport {

	private static final long serialVersionUID = 1654432868760393645L;
	
	@Resource
	private StudentService studentService;
	
	private List<Student> students;
	private Student student;

	@Override
	public String execute() throws Exception {
		students = studentService.findAll();
		return SUCCESS;
	}
	
	public String addStudent() throws Exception {
		studentService.saveStudent(student);
		return SUCCESS;
	}
	
	public String deleteStudent() throws Exception {
		studentService.delete(12L);
		return SUCCESS;
	}
	
	public String findStudent() throws Exception {
		studentService.getStudent(12L);
		return SUCCESS;
	}

	/*-------------get set method---------------------*/
	public List<Student> getStudents() {
		return students;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Student getStudent() {
		return student;
	}
}
