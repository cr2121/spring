package cn.amumu.spring.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.amumu.spring.dao.StudentDao;
import cn.amumu.spring.orm.Student;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Resource
	private StudentDao studentDao;

	@Override
	public Student getFirstStudent() {
		return studentDao.getById(1L);
	}

}
