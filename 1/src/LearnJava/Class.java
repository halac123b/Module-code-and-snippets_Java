package LearnJava;

public class Class {
    String name;
    int age;

    public Class(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Class instance = new Class("conga", 10);
        instance.age += 10;
    }
}
