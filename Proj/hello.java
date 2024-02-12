package Proj;

import java.util.Scanner;

public class Student{
    String name ;
    int age ;
    int marks;
}
public class hello{

    public static void main(String args[]){
        Scanner inp = new Scanner(System.in);
        Student stud[] = new Student[2];
        
        for(Student stu:stud){
            String stud[].name = inp.nextLine();
        }
        for(int n =0 ;n<stud.length;n++){
       System.out.println(stud[n].name);
        }

    }
    //
}