package generics;

import java.util.Arrays;

public class CustomArrayList {

    private int[] data;
    private int DEFAULT_SIZE = 10;
    private int size = 0;          // also works as index value

    public CustomArrayList(){
        this.data = new int[DEFAULT_SIZE];
    }

    public void add(int num){
        if(isFull()){
            resize();
        }
        data[size++] = num;
    }

    private void resize() {        // create new methods by writing them first command = alt + enter
        int[]  temp = new int[data.length * 2];
        for(int i = 0; i < data.length; i++){ // copy the current item in the new array
            temp[i] = data[i];
        }
        data = temp; // data reference variable now points to the temp array's object
    }

    private boolean isFull() {
        return size == data.length;
    }

    public int remove(){
        int removed = data[--size];
        return removed;
    }
    public int get(int index){
        return data[index];
    }

    public int size(){
        return size;
    }
    public void set(int index, int value){
        data[index] = value;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", DEFAULT_SIZE=" + DEFAULT_SIZE +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        CustomArrayList list = new CustomArrayList();
        list.add(3);
        list.add(5);
        list.add(9);
//        list.add("rishaabh");

        String str = "aeiou";
        String strs = "wealoipu";
        System.out.println(strs.contains(str));


        for(int i = 0; i < 14; i++){
            list.add(2 * i);
        }
        System.out.println(list);

    }
}
