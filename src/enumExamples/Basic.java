package enumExamples;

public class Basic {
    enum Week{
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday
    }
    enum Name {
        Rishabh, Gaurav
    }

    public static void main(String[] args) {
        Week week = Week.Monday;

        for(Week day : Week.values()){
            System.out.println(day);
        }
        System.out.println("  ");
        for(Name name : Name.values()){
            System.out.println(name);
        }
    }
}
