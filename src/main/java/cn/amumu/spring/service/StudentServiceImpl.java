package cn.amumu.spring.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.amumu.spring.dao.StudentDao;
import cn.amumu.spring.orm.Student;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Resource
	private StudentDao studentDao;

	@Override
	public Student getFirstStudent() {
		return studentDao.findById(5L);
	}

	@Override
	@Transactional
	@CacheEvict(value="student")
	public void saveStudent(Student student) {
		studentDao.save(student);
	}

	@Override
	@Cacheable(value="student")
	public List<Student> findAll() {
		return studentDao.findAll();
	}

}
