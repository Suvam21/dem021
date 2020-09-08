import java.util.Scanner;

public class Student {
    int id;
    int phy;
    int chem;
    Scanner sc = new Scanner(System.in);

    void getMarks() {
        System.out.print("Enter id: ");
        id = sc.nextInt();
        System.out.print("Enter phy marks: ");
        phy = sc.nextInt();
        System.out.print("Enter chem marks: ");
        chem = sc.nextInt();
    }

    void showTotal() {
        System.out.println("Total marks: " + (phy + chem) + "\n");
    }
}


class StudentBio extends Student {
    int bio;
    Scanner sc = new Scanner(System.in);

    void getMarks(){
        super.getMarks();
        System.out.print("Enter bio marks: ");
        bio =  sc.nextInt();
    }

    void showMarks(){
        System.out.println("Total marks= " + (phy+chem+bio) + "\n");
    }
}

class EnggStudent extends Student {
    int maths;

    void getMarks(){
        Scanner sc = new Scanner(System.in);
        super.getMarks();
        System.out.print("Enter maths marks: ");
        maths = sc.nextInt();
        sc.close();
    }

    void showMarks(){
        System.out.println("Total marks= " + (phy+chem+maths));
    }
}

