package staticExample;

public class Main {
    static float a = 20;

    static class human {
        int age;
        String name;
        int salary;
        boolean married;
        static long population;

        public human(int age, String name, int salary, boolean married) {
            this.age = age;
            this.name = name;
            this.salary = salary;
            this.married = married;
            human.population += 1;
        }

        public static void main(String[] args) {
            human kunal = new human(13, "KK", 1000, false);
            human rahul = new human(15, "RK", 1500, true);
            System.out.println(kunal.population);

            human arpit = new human(25, "AK", 1500, true);
            System.out.println(human.population);
//        fun();

        }
//    static void fun(){
//            CollectionsClass obj = new CollectionsClass();
//            obj.greeting();
//
//    }
//     void greeting(){
//        System.out.println("HEllo");
//    }
    }
}
