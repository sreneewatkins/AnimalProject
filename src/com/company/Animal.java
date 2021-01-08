package com.company;

public class Animal {

        public String name;
        public int age;
        public int weight;

        public Animal(String name, int age, int weight) {
            this.name = name;
            this.age = age;
            this.weight = weight;
        }

        //what is the point of the empty constructor? we can pass variables back and forth
        public Animal() {
        }

        public void speak() {
            System.out.println("HI!");
        }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }
}
