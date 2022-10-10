package com.mma.springmvc;

import com.mma.springmvc.classes.Car;
import com.mma.springmvc.classes.CarDetails;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-bean.xml");
        CarDetails cd = context.getBean("cd", CarDetails.class);
        cd.carDetails();
    }
}
