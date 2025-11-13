public class Students extends Person{
    double gpa;
    Students(String first, String last, double gpa){
        super(first, last);
        this.gpa = gpa;
    }

    void showGPA(){
        System.out.println("My gpa is "+ this.gpa);
    }
}
