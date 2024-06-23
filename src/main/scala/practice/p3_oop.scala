package practice

object p3_oop extends App {
    // class and instance
    class Animal {
        // define fields
        val age: Int = 0
        // define methods
        def eat() = println("I'm eating")
    }

    val anAnimal = new Animal

    // inheritance
    class Dog(val name: String) extends Animal // constructor definition val name
    val aDog = new Dog("Lassie")

    //constructor arguments are NOT fields: need to put a val before the constructor argument
    aDog.name

    //subtype polymorphism
    val aDeclaredAnimal: Animal = new Dog("Hachi")
    aDeclaredAnimal.eat() // the most derived method will be called at runtime

    // abstract class
    abstract class walkingAnimal {
        val hasLegs = true // by default public, can restrict by adding private or protected
        def walk(): Unit
    }

    // "interface" = ultimate abstract type
    trait Carnivore {
        def eat(animal: Animal):Unit
    }

    
    trait Philosopher {
        def ?!(thougth: String): Unit // walid method name
    }

    

    // single-class inheritance, multi-trait "mixing"
    class Crocodile extends Animal with Carnivore with Philosopher {
        override def eat(animal: Animal): Unit = println("I am eating you, animal!")
    }

    val aCroc = new Crocodile
    aCroc.eat(aDog)
    aCroc eat aDog // infix notation = object method argument, only available for methods with one argument
    aCroc ?! "What if we could fly?"

    // operations in scala are actually methods
    val basicMath = 1+3
    val anotherBasicMath = 1.+(2)



}