package com.revature.jan11.service;

import com.revature.jan11.studentprocessing.Student;
import com.revature.jan11.studentprocessing.ProcessedStudent;
import com.revature.jan11.studentprocessing.StudentParseException;
import org.apache.log4j.Logger;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ProcessStudent {
    static Logger logger = Logger.getLogger(ProcessStudent.class);
    public void process(){
        logger.debug("ProcessStudent - process() has started");
        try{
            logger.debug("Trying to open input.dat file");
            FileInputStream fileInputStream = new FileInputStream("input.dat");
            logger.debug("Trying to open output.dat file");
            FileOutputStream fileOutputStream = new FileOutputStream("output.dat");
            int nobytes = fileInputStream.available();
            byte[] data = new byte[nobytes];
            fileInputStream.read(data);
            String csv = new String(data);
            String[] studentCSV = csv.split("\n");
            logger.debug("Looping through all records existing in the  input file");
            for (int i = 0; i < studentCSV.length; i++){
                Student student = Student.parseStudent(studentCSV[i]);
                logger.debug(i+ " position student id is "+ student.getId());
                int total = student.getSub1() + student.getSub2() + student.getSub3();
                double average = (double) total / 3;
                ProcessedStudent processedStudent = new ProcessedStudent();
                processedStudent.setId(student.getId());
                processedStudent.setName(student.getName());
                processedStudent.setSub1(student.getSub1());
                processedStudent.setSub2(student.getSub2());
                processedStudent.setSub3(student.getSub3());
                processedStudent.setTotal(total);
                processedStudent.setAverage(average);
                String proStudent = processedStudent.toCSV()+"\n";
                fileOutputStream.write(proStudent.getBytes());
                logger.debug("Saved "+processedStudent.getId()+ " into output file");
            }
            logger.debug("Student processing has completed");
            fileInputStream.close();
            fileOutputStream.close();
        }
        catch (FileNotFoundException e){
            logger.error(e.getMessage());
        }
        catch (IOException e){
            logger.error(e.getMessage());
        }
        catch (StudentParseException studentParseException){
            logger.error(studentParseException.getMessage());
        }
    }
}
