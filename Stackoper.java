import java.util.*;  
public class Stackoper{  
public static void main(String args[]){  
Stack<Integer> stack = new Stack<Integer>();  
stack.push(78);  
stack.push(98);  
stack.push(78);  
stack.push(95);  
stack.push(93); 
stack.push(85); 
System.out.println(stack);  
System.out.println(stack.pop()); 
System.out.println(stack.pop());
System.out.println(stack);  
}  
}  