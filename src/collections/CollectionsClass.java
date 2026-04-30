package collections;
import access.A;
import java.util.*;

public class CollectionsClass {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        StringBuffer sbf = new StringBuffer();

        for(int i = 0; i < 26; i++){
            int random = (int)Math.floor(Math.random() * 26 ) + 97;
            char ch = (char) random;
            sbf.append(ch);
        }
        System.out.println(sbf);
        System.out.println(sbf.length());



//        System.out.println(a++);
//        Set<Integer> set = new HashSet<>();
//        Set<Integer> set = new HashSet<>();
//        set.add(5);
//        set.add(5);
//        set.add(8);
//        set.add(324);
//        Iterator<Integer> itr = set.iterator();
//        while(itr.hasNext()){
//            System.out.println(itr.next());
//        }
////        Object[] arrr = set.toArray();
//        System.out.println(arrr[2]);
//        System.out.println(Arrays.toString(arrr));
//
//
//        int[] arr = new int[set.size()];
//        int i = 0;
//
//        System.out.println(Arrays.toString(arr));
//
//        List<String> list = new ArrayList<>();
//        list.add("rb");
//        list.add("rishabh");
//
//        Collections.addAll(list, "KG", "ST", "SSC","KG");
//        System.out.println(list);
//        Collections.swap(list, 1,4);
//        System.out.println(Collections.frequency(list, new String("KG")));
//        System.out.println(list);
    }
}
