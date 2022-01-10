package com.revature.jan10.exercises;

import com.revature.jan10.collections.Employee;

import java.io.*;

public class FileRead2 {
    public static void main(String[] args) {
        try {
            System.out.println("Trying to read the content");
            FileInputStream fileInputStream = new FileInputStream("employee.dat");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            Employee employee = (Employee) objectInputStream.readObject();
            System.out.println(employee);
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        }
        catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        System.out.println("Completed");
    }
}
