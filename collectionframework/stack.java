package collectionframework;

import java.util.Stack;

public class stack {
    public static void main(String[] args) {
        Stack<Integer> s= new Stack<Integer>();
        s.push(4);
        s.push(23);
        s.push(45);
        s.push(34);
        s.push(56);
        s.push(78);
        System.out.println(s);
        s.addFirst(1);
        System.out.println(s);
        s.addLast(90);
        System.out.println(s);
        s.pop();
        System.out.println(s);
        
        System.out.println(s.peek());
    }

}
