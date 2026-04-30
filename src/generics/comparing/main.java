package generics.comparing;

import java.util.*;

public class main {
    public static void main(String[] args) {
        Student kunal = new Student(12, 89.5f);
        Student rahul = new Student(13, 72.5f);
        Student rishabh = new Student(14, 74.5f);

        Student[] list = {kunal, rahul, rishabh};
        System.out.println(Arrays.toString(list));
        Arrays.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return (int)(o1.marks - o2.marks);
            }
        });
        System.out.println(Arrays.toString(list));


//        if(kunal.compareTo(rahul) < 0){
//            System.out.println("rahul has more marks");
//        }
//        else if(kunal.compareTo(rahul) == 0){
//            System.out.println("both have same marks");
//        }
//        else{
//            System.out.println("kunal has more marks");
//        }
    }
}
