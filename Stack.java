// package java;

import java.util.ArrayList;

public class Stack{

    static ArrayList<Integer> list = new ArrayList<>();

    public static void push(int data){
        list.add(data);
    }

    public static void main(String[] args) {

        push(1);
        push(2);
        push(3);
        push(4);

        while(!list.isEmpty()){
            // System.out.println(list);  
            System.out.println(list);
            list.remove(list.size() - 1); 
        }
        
    }

}



