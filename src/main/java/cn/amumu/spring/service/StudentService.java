package cn.amumu.spring.service;

import java.util.List;

import cn.amumu.spring.orm.Student;

public interface StudentService {
	public Student getFirstStudent();
	
	public void saveStudent(Student student);
	
	public List<Student> findAll();
}
