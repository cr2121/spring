package cn.amumu.spring.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.amumu.spring.service.StudentService;

public class Main {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		StudentService studentService = (StudentService) context
				.getBean("studentServiceImpl");
		System.out.println(studentService.getFirstStudent().getId());
		System.out.println(studentService.getFirstStudent().getId());

		context.close();
	}

}
