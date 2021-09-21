package org.example.bekhzod;

public class Accountant implements Employee{
    @Override
    public String profession() {
        return "Accountant";
    }

    @Override
    public int salary() {
        return 2000;
    }

    @Override
    public int workingYear() {
        return 8;
    }

    @Override
    public String companyName() {
        return "Epam Company";
    }
}
