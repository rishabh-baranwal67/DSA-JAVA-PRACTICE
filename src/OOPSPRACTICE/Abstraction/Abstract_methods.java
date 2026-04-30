package OOPSPRACTICE.Abstraction;

//public class Abstract_methods {
//}
// Java Program to implement Abstract Class
// having constructor, data member, and methods
import java.io.*;

abstract class Subject {
    Subject() {
        System.out.println("Learning Subject");
    }

    abstract void syllabus();

    void Learn(){
        System.out.println("Preparing Right Now!");
    }
}

class IT extends Subject {
    void syllabus() {
        System.out.println("C , Java , C++");
    }
}

public class Abstract_methods {
    public static void main(String[] args) {
        Subject x = new IT();

        x.syllabus();
        x.Learn();
    }
}
