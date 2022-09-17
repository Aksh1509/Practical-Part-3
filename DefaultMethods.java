//Aksh Surani 21ce140 CE2 C2

import java.net.Socket;

interface Sayable{  
        // Default method   
        default void say(){  
            System.out.println("Hello, this is default method");  
        }  
        // Abstract method  
        void sayMore(String msg);  
    }  
    public class DefaultMethods implements Sayable{  
        public void sayMore(String msg){        // implementing abstract method   
            System.out.println(msg);  
        }  
        public static void main(String[] args) {  
            DefaultMethods dm = new DefaultMethods();  
            dm.say();   // calling default method  
            dm.sayMore("Work is worship");  // calling abstract method  
            System.out.println("21CE140 AKSH");
        }  
    }
