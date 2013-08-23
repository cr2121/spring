package cn.amumu.spring.dao;

import java.util.List;

import cn.amumu.spring.orm.Student;

public interface StudentDao {
	
	public Student findById(Long id);
	
	public void save(Student student);
	
	public List<Student> findAll();

	public void delete(long studentId);
}
