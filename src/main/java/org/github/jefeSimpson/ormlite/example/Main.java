package org.github.jefeSimpson.ormlite.example;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);
        CrudCommand crudCommand = new CrudCommand();
        StudentCreateCommand studentCreateCommand = new StudentCreateCommand();
        while (true){
        System.out.println("1 - listAllStudent, 2 - studentById, 3 - delete, 4 - create, 5 - update");
        String crudChecker = sc.next(); // 1 - listAllStudent, 2 - studentById, 3 - delete, 4 - create, 5 - update
        if(crudChecker.equals("listAllStudent")){
            System.out.println(crudCommand.getStudent().toString());
        }
        else if(crudChecker.equals("studentById")){

            System.out.println(crudCommand.getStudentById(sc.nextLong()).toString());
        }
        else if(crudChecker.equals("delete")){
            System.out.println("1,2 - studentClass, 3,4,5 - student");
            StudentClass studentClass = new StudentClass(sc.nextLong(),sc.next());
            crudCommand.deleteStudent(new Student(sc.nextLong(),sc.next(),sc.next(),studentClass));
            studentCreateCommand.deleteStudentClass(studentClass);
        }
        else if(crudChecker.equals("create")){
            System.out.println("1,2 - studentClass, 3,4,5 - student");
            StudentClass studentClass = new StudentClass(sc.nextLong(),sc.next());
            crudCommand.createStudent(new Student(sc.nextLong(),sc.next(),sc.next(),studentClass));
            studentCreateCommand.createStudentClass(studentClass);
        }
        else if(crudChecker.equals("update")){
            System.out.println("1,2 - studentClass, 3,4,5 - student");
            StudentClass studentClass = new StudentClass(sc.nextLong(),sc.next());
            crudCommand.updateStudent(new Student(sc.nextLong(),sc.next(),sc.next(),studentClass));
            studentCreateCommand.updateStudentClass(studentClass);
        }
    }
    }

}
