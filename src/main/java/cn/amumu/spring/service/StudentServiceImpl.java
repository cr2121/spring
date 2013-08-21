package cn.amumu.spring.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.amumu.spring.dao.StudentDao;
import cn.amumu.spring.orm.Student;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Resource
	private StudentDao studentDao;

	@Override
	@Transactional
	public Student getFirstStudent() {
		return studentDao.getByMapper(5L);
	}

	@Override
	@Transactional
	public void saveStudent(Student student) {
		studentDao.save(student);
	}

	@Override
	public List<Student> findAll() {
		return studentDao.findAll();
	}

}
