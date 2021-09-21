package org.example.bekhzod;

import org.springframework.stereotype.Component;

@Component
public class TransportDepartment implements Department{
    @Override
    public void printDepartmentName() {
        System.out.println(getClass().getSimpleName());
    }
}
