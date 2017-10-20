/**
 * 
 */
package com.veera.springAOP;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.veera.springAOP.service.ShapeService;

/**
 * @author Veera
 *
 */
public class MainApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
		ShapeService sService=ctx.getBean("shapeService",ShapeService.class);
		System.out.println(sService.getTriangle().getName());

	}

}
