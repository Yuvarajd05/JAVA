
public abstract class shape{
    //void info();
    //Abstract methods cannot be implemented
    void info(){
        System.out.println("Information");
    }

    void draw(){
        System.out.println("Drawing Shape.");
    }
}
class Rectangle extends shape{
    //@Override

    void draw(){
        System.out.println("Drawing Rectangle.");
    }
}
class main{
    public static void main(String[] args) {
        ///Shape r = new Shape();
        //Shape is abstract and cannot be instantiated
        shape rec = new Rectangle();
        rec.info();
        rec.draw();

    }
}