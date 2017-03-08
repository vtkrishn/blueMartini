package javaproject;

import java.util.Stack;

public class Example<T> {
    public Example() {
        super();
        Stack<T> stack = new Stack<T>();
        stack.push((T)"one");
        while(!stack.isEmpty()){
            T s = stack.pop();
            System.out.println(s);
        }
    }
    
    public static void main(String[] args){
        Example<String> e = new Example<String>();
    }
}
