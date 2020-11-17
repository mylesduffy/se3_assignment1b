package com.mycompany.se3_assignment1b;

import com.mycompany.se3_assignment1.*;
import org.joda.time.DateTime;

/**
 *
 * @author myles
 */
public class Driver {
    
    public static void main(String[] args){
        Student student1 = new Student("Colin Flaherty", 22, 17303453, "17-04-1999");
        Student student2 = new Student("Maeve Kennedy", 23, 17320345, "21-03-1998");
        Student student3 = new Student("Declan Dermody", 19, 17304858, "05-06-2000");
        Student student4 = new Student("Jennifer Kelly", 20, 17384938, "29-01-2000");
        Student student5 = new Student("Kevin Doherty", 20, 17481923, "01-01-2001");
        Student student6 = new Student("Paul Fitzpatrick", 21, 17831923, "30-11-1999");
        
        Module module1 = new Module("Software Engineering", "CT417");
        Module module2 = new Module("Machine Learning", "CT4101");
        Module module3 = new Module("Digital Signal Processing", "EE445"); 
        Module module4 = new Module("System on Chip Design", "EE451"); 
        Module module5 = new Module("Power Systems", "EE450");
        Module module6 = new Module("Technology Innovation", "ME432");
        
        Course course1 = new Course("ECE", new DateTime("2020-08-01T00:00:00Z"), new DateTime("2021-05-31T00:00:00Z"));
        Course course2 = new Course("EEE", new DateTime("2020-08-01T00:00:00Z"), new DateTime("2021-05-31T00:00:00Z"));
        Course course3 = new Course("CS", new DateTime("2020-08-01T00:00:00Z"), new DateTime("2021-05-31T00:00:00Z"));
        
        course1.addModuleCourse(module1);
        course1.addModuleCourse(module2);
        course1.addModuleCourse(module3);
        course1.addModuleCourse(module4);
        
        course2.addModuleCourse(module3);
        course2.addModuleCourse(module4);
        course2.addModuleCourse(module5);
        course2.addModuleCourse(module6);
        
        course3.addModuleCourse(module1);
        course3.addModuleCourse(module2);
        course3.addModuleCourse(module6);
        
        course1.enrollStudentCourse(student1);
        course1.enrollStudentCourse(student2);
        
        course2.enrollStudentCourse(student3);
        course2.enrollStudentCourse(student4);
       
        course3.enrollStudentCourse(student5);
        course3.enrollStudentCourse(student6);
        
        
        System.out.println(course1.toString());
        System.out.println("\r\r");
        System.out.println(course2.toString());
        System.out.println("\r\r");
        System.out.println(course3.toString());
        
    }
}
