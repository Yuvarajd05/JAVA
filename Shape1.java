

public interface Shape1 {
    void draw();
    //The method will internally be declared as abstract method
}
class Rectangle implements Shape1{
    @Override
    public void draw(){
        //only public methods can be used to access methods of interfaces
        //Not default, private or protected
        System.out.println("Drawing Rectangle.");
    }
    void erase(){
        System.out.println("Erase shape");
    }
}
class main{
    public static void main(String[] args) {
        Shape1 rec2 = new Shape1() {
            @Override
            public void draw() {
                System.out.println("Hi");
            }
        };
        rec2.draw();
        
        Shape1 rec = new Rectangle();
        rec.draw();

        Rectangle rec3 = new Rectangle();
        rec3.draw();
        rec3.erase();
    }
}