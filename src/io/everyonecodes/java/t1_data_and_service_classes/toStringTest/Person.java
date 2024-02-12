package io.everyonecodes.java.t1_data_and_service_classes.toStringTest;


    public class Person {
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        // Other constructors, getters, setters, and methods are omitted for brevity

        @Override
        public String toString() {
            return "Person name= " + name + ", age= " + age;
        }

        public static void main(String[] args) {
            Person person = new Person("John Doe", 25);

            // Using the toString method implicitly when printing
            System.out.println(person);

            // Explicitly calling the toString method
            String personString = person.toString();
            System.out.println(personString);
        }
    }


