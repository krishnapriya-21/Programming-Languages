
class StudentDemo{
    String name;
    int age;

    // Own constructor with same class name
    StudentDemo(){
        name = "Unknown";
        age= 18;
    }
}

public class NoArgConstructorDemo {
    public static void main(String[] args){
        StudentDemo student = new StudentDemo();
        System.out.println(student.name);
        System.out.println(student.age);
    }
}
