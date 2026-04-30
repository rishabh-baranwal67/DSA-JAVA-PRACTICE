package generics;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomGenericArrayList<T> { // <T> template for type
        private Object[] data;
        private int DEFAULT_SIZE = 10;
        private int size = 0;          // also works as index value

        public CustomGenericArrayList(){
            this.data = new Object[DEFAULT_SIZE];
        }

        public void add(T num){
            if(isFull()){
                resize();
            }
            data[size++] = num;
        }

        private void resize() {        // create new methods by writing them first command = alt + enter
            Object[]  temp = new Object[data.length * 2];
            for(int i = 0; i < data.length; i++){ // copy the current item in the new array
                temp[i] = data[i];
            }
            data = temp; // data reference variable now points to the temp array's object
        }

        private boolean isFull() {
            return size == data.length;
        }

        public T remove(){
            T removed = (T) (data[--size]);
            return removed;
        }
        public T get(int index){
            return (T)data[index];
        }

        public int size(){
            return size;
        }
        public void set(int index, T value){
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
            ArrayList<Integer> lists = new ArrayList<>();
            CustomGenericArrayList<Integer> list = new CustomGenericArrayList<Integer>();
            list.add(3);
            list.add(5);
            list.add(9);

            String str = "aeiou";
            String strs = "wealoipu";
            System.out.println(strs.contains(str));
            for(int i = 0; i < 14; i++){
                list.add(2 * i);
            }
            System.out.println(list);

        }
    }

