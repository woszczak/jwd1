//Korzystając z mechanizmu dziedziczenia stwórz strukturę klas.
// Klasy Dog oraz Cat powinny dziedziczyć po klasie Animal i jednocześnie rozszerzać interfejs Voice.
public class Animals {

    class Animal{
        String name;
        int age;
        public void eat(){
        }
    }

    interface Voice {
        void cry();
        void snore();
    }


    abstract class Dog extends Animal implements Voice{

        @Override
        public void cry() {
        }

        @Override
        public void snore() {

        }

        public void bark(){
        }

        @Override
        public void eat() {

        }
    }

    abstract class Cat extends Animal implements Voice{

        @Override
        public void cry() {
        }

        @Override
        public void snore() {

        }

        public void meow(){
        }

        @Override
        public void eat() {

        }
    }
}
