package org.example.bekhzod;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfig.class);

        ListOfDepartments listOfDepartments = context.getBean("list",ListOfDepartments.class);
        listOfDepartments.addAllDepartments();
        listOfDepartments.dipsplayDepartments();

        context.close();
    }
}
