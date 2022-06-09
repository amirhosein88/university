package com.example.springdbconfig.Service;

import com.example.springdbconfig.Model.Student;
import jdk.nashorn.internal.parser.Scanner;

public class Cli {

    private Scanner scanner;
    private Registration register;

    private Student student;

    public void recognizeSelect() {
        String SelectS;
        SelectS= scanner.nextLine();
        if (SelectS.equals("student")) {
            register.register_student();
        } else if (SelectS.equals("teacher")) {
            System.out.println("");

        } else {
            System.out.println("so what are you fucking here");;
        }
    }


    public void showList() {
        System.out.println(student.students);
    }
}
