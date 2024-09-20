package runner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Student2;


public class Runner2 {

	private static ApplicationContext context;

	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("config2.xml");

Student2 student = (Student2) context.getBean("data");

student.show();
	}

}
