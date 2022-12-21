package com.company;

import java.lang.*;
import java.util.*;

class Help{
    void helpon(int what){
        switch (what){
            case '1':
                System.out.println("Onepaтop if:\n");
                System.out.println("if(ycлoвиe) оператор;");
                System.out.println("else оператор;");
                break;
            case '2':
                System.out.println("Oпepaтop switch:\n");
                System.out.println("switch(выpaжeниe) {");
                System.out.println("case constant: ");
                System.out.println("statement sequence");
                System.out.println("break;");
                System.out.println("//...");
                System.out.println("}");
                break;
            case '3':
                System.out.println("Operator for:\n");
                System.out.println("for (initialization; condition; iteration)");
                System.out.println("operator");
                break;
            case '4':
                System.out.println("Onepaтop while:\n");
                System.out.println("while(ycлoвиe) оператор;");
                break;
            case '5':
                System.out.println("Oпepaтop do-while:\n");
                System.out.println("do {");
                System.out.println("оператор;");
                System.out.println("} while (условие);");
                break;
            case '6':
                System.out.println("Oпepaтop break:\n");
                System.out.println("break; или break метка;");
                break;
            case '7':
                System.out.println("Oпepaтop continue:\n");
                System.out.println("continue; или continue метка;");
                break;
        }
        System.out.println();
    }
    void showmenu(){
        System.out.println("Cпpaвкa:");
        System.out.println(" 1. if");
        System.out.println(" 2. switch");
        System.out.println(" 3. for");
        System.out.println(" 4. while");
        System.out.println(" 5. do-while");
        System.out.println(" 6. break");
        System.out.println(" 7. continue\n");
        System.out.print("Bыбepитe (q - выход): ");
    }
    boolean isValid(int ch){
        if (ch < '1' | ch > '7' & ch != 'q') return false;
        else return true;
    }
}


public class LearnJava {
    public static void main(String[] args) throws java.io.IOException {
        char choice, ignore;
        Help hlpobj = new Help();

        for (; ; ) {
            do {
                hlpobj.showmenu();
                choice = (char) System.in.read();

                do {
                    ignore = (char) System.in.read();
                } while (ignore != '\n');

            } while (!hlpobj.isValid(choice));

            if (choice == 'q') break;
            System.out.println('\n');

            hlpobj.helpon(choice);
        }
    }
}



/**
//simple numbers 2 to 100
public class LearnJava {
    public static void main(String[] args) {
        for(int i = 2; i <= 103;i++){
            int num = 0;
            for(int j = 2;j < i;j++){
                if(i % j == 0){
                    num++;
                    break;
                }
            }
            if(num == 0)
                System.out.print(i + "\t");
        }
    }
}
**/
