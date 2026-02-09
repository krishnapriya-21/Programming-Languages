// Base class

class Employee{

    void work(){
        System.out.println("Employee is working");
    }
}

//Child class of base class

class Manager extends Employee{
    
    @Override
    void work(){
        System.out.println("Manager is planning and supervising");
    }
}

class Developer extends Employee{
    @Override
    void work(){
        System.out.println("Developer is developing project");
    }
}


class Tester extends Employee{
    @Override
    void work(){
        System.out.println("Tester is Testing project");
    }
}


public class OverridingExample {
    public static void main(String[] args){

        Employee employee = new Employee();
        Employee manager = new Manager();
        Employee developer = new Developer();
        Employee tester = new Tester();

        employee.work();
        manager.work();
        developer.work();
        tester.work();

    }
}
