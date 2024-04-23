class InClass {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "John";
        person.age = 30;
        person.sayHello();
    }
}

public class Person {

    String name;
    int age;

    public void sayHello() {
        System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
    }

}
