package com.example.springdbconfig.Controller;

import java.util.Scanner;

public class Inputcontroller {

    public Scanner scanner = new Scanner(System.in);

    static String nameInput;
    static String identical_num;
    static String fieldInput;
    static int entering_year;

    public String inputName() {
        System.out.println("input name");
        String firstNameInput = scanner.nextLine();
        int estimateStringInputSize = firstNameInput.length();
        if (estimateStringInputSize > 1 & estimateStringInputSize < 20) {
            nameInput = firstNameInput;
        } else {
            System.out.println("this name format is invalid");
            // danger :: // here app cloesd
        }
        return firstNameInput;
    }

    public Long identical_num() {
        System.out.println("input identical_num");
        String first_identical_num = scanner.nextLine();
        int estimate_String_Identical_num = first_identical_num.length();
        if (estimate_String_Identical_num > 1 && estimate_String_Identical_num < 9) {
            identical_num = first_identical_num;
        } else {
            System.out.println("identical_num format is invalid");
            //danger ...
        }

        return null;
    }

    public String inputField() {
        System.out.println("input field");
        String firstFieldInput = scanner.nextLine();
        int estimateStringFieldSize = firstFieldInput.length();
        if (estimateStringFieldSize > 1 & estimateStringFieldSize < 20) {
            fieldInput = firstFieldInput;
        } else {
            System.out.println("this name format is invalid");
            // danger :: // here app cloesd
        }
        return firstFieldInput;
    }
    public int inputEnteringYear(){
        System.out.println("input entering year");
        Integer firstEnteringYearInput = scanner.nextInt();
        if(firstEnteringYearInput > 1300 && firstEnteringYearInput < 1500){
            entering_year = firstEnteringYearInput;
        }
        else {
            System.out.println("entering year invalid");
        }
        return 0;
    }
}
