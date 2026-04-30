package generics.comparing;

public class Student {
    int roll_no;
    float marks;

    public Student(int roll_no, float marks) {
        this.roll_no = roll_no;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "roll_no=" + roll_no +
                ", marks=" + marks +
                '}';
    }

    public int compareTo(Student rahul) {
        int diff = (int)(this.marks - rahul.marks);
        return diff;
    }
}
