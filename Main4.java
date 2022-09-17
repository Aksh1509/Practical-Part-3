//Aksh Surani 21ce140 CE2 C2

class Animal {
 
 public void testInstanceMethod() {
 System.out.println("The instance method in Animal");
 } }
 class Main4 extends Animal {
 
    public void testInstanceMethod() {
    System.out.println("The instance method in Cat");
    }
    public static void main(String[] args) {
    Main4 myCat = new Main4();
    Animal myAnimal =new Animal();
    //Animal.testClassMethod();
    myAnimal.testInstanceMethod();
    myCat.testInstanceMethod();
   
    } }