package org.example.bekhzod;

public class ProductManager implements Employee {
    @Override
    public String profession() {
        return "Product Manager";
    }

    @Override
    public int salary() {
        return 8000;
    }

    @Override
    public int workingYear() {
        return 10;
    }

    @Override
    public String companyName() {
        return "Apple";
    }
}
