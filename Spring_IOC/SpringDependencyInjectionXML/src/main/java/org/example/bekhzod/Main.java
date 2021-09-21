package org.example.bekhzod;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");

        Person bekhzod = context.getBean("person", Person.class);
        System.out.println(bekhzod);
        bekhzod.getDetails();

        context.close();

    }
}
