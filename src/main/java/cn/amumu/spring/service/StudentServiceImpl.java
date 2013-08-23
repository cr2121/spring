package cn.amumu.spring.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.Caching;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.amumu.spring.dao.StudentDao;
import cn.amumu.spring.orm.Student;

@Service
public class StudentServiceImpl implements StudentService {

	@Resource
	private StudentDao studentDao;

	@Override
	@Cacheable(value = "student", key = "#studentId")
	public Student getStudent(long studentId) {
		return studentDao.findById(studentId);
	}

	@Override
	@Transactional
	@CacheEvict(value = "student", key = "'findAllStudent'")
	public void saveStudent(Student student) {
		studentDao.save(student);
	}

	@Override
	@Cacheable(value = "student", key = "'findAllStudent'")
	public List<Student> findAll() {
		return studentDao.findAll();
	}

	@Override
	@Caching(evict={@CacheEvict(value = "student", key = "'findAllStudent'"),@CacheEvict(value = "student", key = "#studentId")})
	public void delete(long studentId) {
		studentDao.delete(studentId);
	}

}
