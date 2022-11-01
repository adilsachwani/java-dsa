package datastructure.stack;

import java.util.ArrayList;
import java.util.List;

public class StackFromArrayList {

    private List<Integer> list = new ArrayList<>();

    public void push(int data){
        list.add(data);
    }

    public int pop(){
        if(isEmpty()){
            return -1;
        }
        int data = list.get(list.size()-1);
        list.remove(list.size()-1);
        return data;
    }

    public int peek(){
        if(isEmpty()){
            return -1;
        }
        return list.get(list.size()-1);
    }

    public boolean isEmpty(){
        return list.isEmpty();
    }

}
