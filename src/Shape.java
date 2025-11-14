public abstract class Shape {
    abstract double area();//Abstract method which needs to be implemented by the children


    void display(){//concrete method
        System.out.println("This is a shape");
    }
}
