 public class CallGraph {
       public static void main(String[] args) {
           A b = new B();
           b = new A();
           int x = b.foo();
       }
     }
     class A{
       public int foo(){
         int x = 500;
         return x;
      }
    }
    
     class B extends A{
       public int foo () {
          int x = 1000;
          return x;
       }
     }
     class C extends A{
      public int foo () {
           int x = 1;
          return x;
       }
 }