package cn.amumu.spring.action;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;

import cn.amumu.spring.dao.StudentDao;
import cn.amumu.spring.orm.Student;

import com.opensymphony.xwork2.ActionSupport;

public class IndexAction extends ActionSupport {

	private static final long serialVersionUID = 2213532074807011469L;
	
	@Autowired
	private StudentDao studentDao;

	@Override
	public String execute() throws Exception {
		Session session = studentDao.getSession();
		session.get(Student.class, 1);
		return super.execute();
	}
}
