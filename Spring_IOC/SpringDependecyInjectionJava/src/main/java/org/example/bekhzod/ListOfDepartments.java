package org.example.bekhzod;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ListOfDepartments {
    private List<Department> list;
    private Department department;
    private Department department1;
    private Department department2;

    @Autowired
    public ListOfDepartments(@Qualifier("financialDepartment") Department department,
                             @Qualifier("salesDepartment")Department department1,
                             @Qualifier("transportDepartment")Department department2) {
        this.department = department;
        this.department1 = department1;
        this.department2 = department2;
        list = new ArrayList<>();
    }

    public void addAllDepartments(){
        list.add(department);
        list.add(department1);
        list.add(department2);
    }

    public void dipsplayDepartments(){
        list.forEach(Department::printDepartmentName);
    }
}
