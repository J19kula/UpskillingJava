package com.revature.jan10.exercises;

import com.revature.jan10.collections.Employee;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class FileWrite2 {
    public static void main(String[] args) {
        Employee employee = new Employee(101, "Jacob", "Kula", "j19kula@gmail.com");
        try{
            System.out.println("Trying to write employee to file");
            FileOutputStream fileOutputStream = new FileOutputStream("employee.dat");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(employee);
            objectOutputStream.close();

        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        }
        System.out.println("Completed");

    }
}
