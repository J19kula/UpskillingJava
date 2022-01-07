package com.revature.jan7;

public interface DataAccess {
    void save(Employee employee);
    Employee read();
    Employee update(Employee employee);
    void delete();

}
