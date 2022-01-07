package com.revature.jan7;

public class DatabaseDataAccess implements DataAccess{
    @Override
    public void save(Employee employee) {
        System.out.println("Saving an employee object into Database "+ employee);
    }

    @Override
    public Employee read() {
        System.out.println("Reading a single employee object from DB");
        return null;
    }

    @Override
    public Employee update(Employee employee) {
        System.out.println("Updating an employee data existing in DB");
        return null;
    }

    @Override
    public void delete() {
        System.out.println("Deleting an employee data existing in DB");
    }

    public void findByFirstName(String firstName){
        System.out.println("Finding an employee by their First Name");
    }
}
