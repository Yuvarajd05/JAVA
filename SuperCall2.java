

public class SuperCall2 {
    SuperCall2(int a){
        System.out.println("From Parent");
    }
}
class Child2 extends SuperCall2{
    Child2(){
        super(10);
        //If super call is parameterized then the programmer should
        //explicitly call the super class using super()
        System.out.println("From Child");
    }
}

class main2{
    public static void main(String[] args) {
        Child2 c2 = new Child2();
        //If super call is parameterized then the programmer should
        //explicitly call the super class using super()
    }
}