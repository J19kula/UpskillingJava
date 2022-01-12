package com.revature.jan11.studentprocessing;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    int id;
    String name;
    int sub1;
    int sub2;
    int sub3;

    public String toCSV(){
        return id+", "+name+", "+sub1+", "+sub2+", "+ sub3;
    }

    public static Student parseStudent(String csv) throws StudentParseException{
        try{
            String[] values = csv.split(",");
            int id = Integer.parseInt(values[0].trim());
            String name = values[1].trim();
            int sub1 = Integer.parseInt(values[2].trim());
            int sub2 = Integer.parseInt(values[3].trim());
            int sub3 = Integer.parseInt(values[4].trim());
            Student student = new Student(id, name, sub1, sub2, sub3);
            return student;
        }
        catch (ArrayIndexOutOfBoundsException studentParseException){
            throw new StudentParseException(studentParseException);
        }

    }
}
