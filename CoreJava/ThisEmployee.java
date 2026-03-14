public class ThisEmployee {
    String name;
    int id;

    ThisEmployee(String name, int id){
        this.name = name; // this refers to  current object's variable
        this.id= id;
    }

    void display(){
        System.out.println("Name is: " + this.name + " ID is: " + this.id);
    }

    public static void main(String[] args){
        ThisEmployee te = new ThisEmployee("Carol",101);
        te.display();
    }
}
