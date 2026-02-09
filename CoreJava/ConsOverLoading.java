class Student {
    String name;
    int age;

    // No-arg constructor
    Student() {
        name = "Unknown";
        age = 18;
    }

    // Parameterized constructor
    Student(String n, int a) {
        name = n;
        age = a;
    }
}


public class ConsOverLoading {
     public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Charlie", 21);

        System.out.println(s1.name + " - " + s1.age);
        System.out.println(s2.name + " - " + s2.age);
    }
}
