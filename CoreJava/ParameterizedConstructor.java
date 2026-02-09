
class StudentDetails{
    String name;
    int age;

    StudentDetails(String n, int a){
        name = n;
        age= a;
    }
}

public class ParameterizedConstructor {
    
    public static void main(String[] args){
        StudentDetails s1 = new StudentDetails("Alice", 18 );
        StudentDetails s2 = new StudentDetails("Bob", 17);

        System.out.println(s1.name + " - " + s1.age);
        System.out.println(s2.name +" - " + s2.age);
    }
}
