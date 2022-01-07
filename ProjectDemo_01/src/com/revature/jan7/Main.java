package com.revature.jan7;

public class Main {
    public static void main(String[] args) {
//        FileDataAccess fileDataAccess = new FileDataAccess();
        DataAccess dataAccess = new FileDataAccess();
        Employee employee = new Employee(101, "Jacob", "Kula", 20);
        dataAccess.save(employee);
    }
}
