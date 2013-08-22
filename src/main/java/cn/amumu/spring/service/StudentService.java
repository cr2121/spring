package cn.amumu.spring.service;

import java.util.List;

import cn.amumu.spring.orm.Student;

public interface StudentService {
	public Student getStudent(long studentId);
	
	public void saveStudent(Student student);
	
	public List<Student> findAll();
	
	public void delete(long studentId);
}
