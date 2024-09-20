package runner;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Student1;



public class Runner1 {

	private static ApplicationContext context;

	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("config1.xml"); 
		
Student1 obj1 = (Student1) context.getBean("data1");
obj1.show();


	}

}
