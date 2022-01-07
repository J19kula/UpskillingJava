package com.revature.jan7;

public class FileDataAccess implements DataAccess{
    @Override
    public void save(Employee employee) {
        System.out.println("Saving Employee into File " + employee);
    }

    @Override
    public Employee read() {
        System.out.println("Reading and returning a single employee from File");
        return null;
    }

    @Override
    public Employee update(Employee employee) {
        System.out.println("Updating an existing employee in the file");
        return null;
    }

    @Override
    public void delete() {
        System.out.println("Deleting an existing employee from the file");
    }

    public void sort(){
        System.out.println("Sorting the employees by ID");
    }
}
