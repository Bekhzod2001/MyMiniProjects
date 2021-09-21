package org.example.bekhzod;

public class SoftwareDeveloper implements Employee{
    @Override
    public String profession() {
        return "Software Developer";
    }

    @Override
    public int salary() {
        return 4000;
    }

    @Override
    public int workingYear() {
        return 5;
    }

    @Override
    public String companyName() {
        return "Amazon";
    }
}
