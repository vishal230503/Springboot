package com.nt.test;

import java.util.ArrayList;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.WishMessageGenerator;

public class SetterInjectionTest {

	public static void main(String[] args) {

		FileSystemResource res=new FileSystemResource("src/main/java/com/nt/cfgs/applicationContext.xml");
		XmlBeanFactory factory=new XmlBeanFactory(res);
		System.out.println("____________________________");
		Object object=factory.getBean("wmg");
		WishMessageGenerator generator=(WishMessageGenerator)object;
		System.out.println("_____________________________");
		String msg=generator.generateMessage(" raja");
		System.out.println("Wish Message is::"+msg);
		System.out.println("_____________________________");
		
	}

}
