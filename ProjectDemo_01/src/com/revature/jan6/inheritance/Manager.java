package com.revature.jan6.inheritance;

import com.revature.jan6.inheritance.Employee;

public class Manager extends Employee {
    private int qualifications;

    public Manager(String name, int id) {
        super(name, id);
    }

    public int getQualifications(){
        return qualifications;
    }

    public void setQualifications(int qualifications) {
        this.qualifications = qualifications;
    }
}
