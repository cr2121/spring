package cn.amumu.spring.dao;

import java.util.List;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

import cn.amumu.spring.orm.Student;

@Component
public class StudentDaoImpl extends BaseDaoImpl implements StudentDao {
	
	@Cacheable(value = "student")
	@Override
	public Student getById(Long id) {
		System.out.println("Load data from db.");
		Student student = new Student();
		student.setId(1L);
		return student;
	}
	
	@Override
	public Student getByMapper(Long id) {
		return sqlSession.selectOne("cn.amumu.spring.student.findById",id);
	}

	@Override
	public void save(Student student) {
		sqlSession.insert("cn.amumu.spring.student.save",student);
	}

	@Override
	public List<Student> findAll() {
		return sqlSession.selectList("cn.amumu.spring.student.findAll");
	}
}
