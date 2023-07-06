package org.stjohn.objects;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DIUsingObjectExecuter {

	public static void main(String[] args) {
		ApplicationContext a = new ClassPathXmlApplicationContext("object.xml");
		Student s = (Student) a.getBean("s1");
		s.print();

	}

}
