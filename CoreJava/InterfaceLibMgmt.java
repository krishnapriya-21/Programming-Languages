// creating an interface containing all methods

interface LibraryItem{

    void displayDetails();
    double calculateLateFee(int dayslate);
}

// creating a class book that implements methods of LibraryItem

class Book implements LibraryItem{

// Data encapsulation method to hide data members of the class book
    private String bookname;
    private String authorname;

  Book(String bookname, String authorname){
    this.bookname= bookname;
    this.authorname = authorname;
}

@Override 
public void displayDetails(){
    System.out.println("Book Name:" + bookname);
    System.out.println("Author Name:" +authorname);
}

@Override 
 public double calculateLateFee(int daysLate){
    double Latefee = daysLate * 2;
    return Latefee;
}

}

// creating a class magazine that implements methods of library item

class Magazine implements LibraryItem{
    private String magazinename;
    private int issuenumber;

    Magazine(String magazinename, int issuenumber){
        this.magazinename= magazinename;
        this.issuenumber= issuenumber;
    }

    @Override
    public void displayDetails(){
        System.out.println("Magazine Name:" + magazinename);
        System.out.println("Issue Number:" + issuenumber);
    }

    @Override
    public double calculateLateFee(int daysLate){
        double Latefee = daysLate * 1;
        return Latefee;
    }
}

//creating a class DVD that implements methods of library item

class DVD implements LibraryItem{
    private String dvdname;
    private int duration;

    public DVD(String dvdname, int duration){
        this.dvdname = dvdname;
        this.duration = duration;
    }

    @Override
    public void displayDetails(){
        System.out.println("DVD name: " + dvdname);
        System.out.println("Duration: " + duration + " minutes");
    }

    @Override
    public double calculateLateFee( int daysLate){
        double latefee = daysLate * 3;
        return latefee;
    }
}

// creating a main class library 

public class InterfaceLibMgmt{

    public static void main(String[] args){

        LibraryItem mybook = new Book("Java Programming", "James Gosling");
        LibraryItem mymagazine = new Magazine("Tech Today",123);
        LibraryItem mydvd = new DVD("Inception" , 148);

        System.out.println("Book Details:");
        mybook.displayDetails();
        System.out.println("Late Fee for 5 days: $" + mybook.calculateLateFee(5));

        System.out.println("\n Magazine Details: ");
        mymagazine.displayDetails();
        System.out.println("Late Fee for 5 days: $ " + mymagazine.calculateLateFee(5));

        System.out.println("\n DVD Details: ");
        mydvd.displayDetails();
        System.out.println("Late Fee for 5 days: $ " + mydvd.calculateLateFee(5));
        
    }
}
