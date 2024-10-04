package assignment2;

public class Student {
    int id;
    String name;
    int age;

    // Default constructor
    public Student() {
        this.id = 0;
        this.name = "Unknown";
        this.age = 0;
    }

    // Parameterized constructor with two parameters
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
        this.age = 0;
    }

    // Parameterized constructor with three parameters
    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        // Creating objects using different constructors
        Student student1 = new Student();
        Student student2 = new Student(1, "Alice");
        Student student3 = new Student(2, "Bob", 20);

        // Displaying the student information
        student1.display();
        student2.display();
        student3.display();
    }
}

