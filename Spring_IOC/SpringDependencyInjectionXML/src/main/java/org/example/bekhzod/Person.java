package org.example.bekhzod;

public class Person {
    private String name;
    private int age;
    private Employee employee;

    public Person(String name, int age, Employee employee) {
        this.name = name;
        this.age = age;
        this.employee = employee;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void getDetails(){
        System.out.printf("Details=[%s,%s,%d,%d]%n",
                employee.profession(), employee.companyName(),
                employee.salary(), employee.workingYear());
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
