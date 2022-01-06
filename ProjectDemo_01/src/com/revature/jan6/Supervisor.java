package com.revature.jan6;

public class Supervisor extends Employee{
    private int experience;

    public Supervisor(String name, int id) {
        super(name, id);
    }

    public int getExperience(){
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
}
