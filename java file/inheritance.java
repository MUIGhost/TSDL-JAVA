//package shri;
//
////Parent class (Superclass)
//class Animal {
// String name;
//
// Animal(String name) {
//     this.name = name;
// }
//
// void sound() {
//     System.out.println(name + " makes a sound");
// }
//}
//
////Single Inheritance (Subclass)
//class Dog extends Animal {
// Dog(String name) {
//     super(name);
// }
//
// void bark() {
//     System.out.println(name + " barks");
// }
//}
//
////Multi-level Inheritance
//class Labrador extends Dog {
// Labrador(String name) {
//     super(name);
// }
//
// void color() {
//     System.out.println(name + " is brown in color");
// }
//}
//
////Hierarchical Inheritance
//class Cat extends Animal {
// Cat(String name) {
//     super(name);
// }
//
// void meow() {
//     System.out.println(name + " meows");
// }
//}
//
////Interface for Multiple Inheritance
//interface Bird {
// void fly();
//}
//
////Hybrid Inheritance
//class Parrot extends Animal implements Bird {
// Parrot(String name) {
//     super(name);
// }
//
// @Override
// void sound() {
//     System.out.println(name + " squawks");
// }
//
// @Override
// public void fly() {
//     System.out.println(name + " flies");
// }
//}
//
//public class inheritance {
// public static void main(String[] args) {
//     // Single Inheritance
//     Dog dog = new Dog("Doggy");
//     dog.sound(); // Output: Doggy makes a sound
//     dog.bark();  // Output: Doggy barks
//
//     // Multi-level Inheritance
//     Labrador labrador = new Labrador("Bruno");
//     labrador.sound(); // Output: Bruno makes a sound
//     labrador.bark();  // Output: Bruno barks
//     labrador.color(); // Output: Bruno is brown in color
//
//     // Hierarchical Inheritance
//     Cat cat = new Cat("Kitty");
//     cat.sound(); // Output: Kitty makes a sound
//     cat.meow();  // Output: Kitty meows
//
//     // Interface for Multiple Inheritance
//     Parrot parrot = new Parrot("Polly");
//     parrot.sound(); // Output: Polly squawks
//     parrot.fly();   // Output: Polly flies
// }
//}
