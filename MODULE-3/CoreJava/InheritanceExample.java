// Base class
class Animal {
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}


class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Bark");
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        
        Animal genericAnimal = new Animal();
        genericAnimal.makeSound(); 

        
        Dog dog = new Dog();
        dog.makeSound();  

        
        Animal animalDog = new Dog();
        animalDog.makeSound(); 
    }
}
