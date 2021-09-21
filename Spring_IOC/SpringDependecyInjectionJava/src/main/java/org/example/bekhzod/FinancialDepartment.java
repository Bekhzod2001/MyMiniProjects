package org.example.bekhzod;

import org.springframework.stereotype.Component;

@Component
public class FinancialDepartment implements Department{

    public void printDepartmentName() {
        System.out.println(getClass().getSimpleName());
    }
}
