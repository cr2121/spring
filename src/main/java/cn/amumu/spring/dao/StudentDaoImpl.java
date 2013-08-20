package cn.amumu.spring.dao;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

import cn.amumu.spring.orm.Student;

@Component
public class StudentDaoImpl implements StudentDao {

	@Cacheable(value = "student")
	@Override
	public Student getById(Long id) {
		System.out.println("getById id = " + id);
		Student student = new Student();
		student.setId(1L);
		return student;
	}
}
