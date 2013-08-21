package cn.amumu.spring.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.amumu.spring.service.StudentService;

public class Main {
	
	static Logger logger = LoggerFactory.getLogger(Main.class);

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"spring/applicationContext.xml");
		StudentService studentService = (StudentService) context
				.getBean("studentServiceImpl");
			
		logger.info("findAll : " + studentService.findAll().size());
		context.close();
	}

}
