public  abstract class Netflix {

    void login(){
        System.out.println("login page");
    }
void watch(){
    System.out.println("Watch movie");
}
}
class Netflixfree extends Netflix{
    @Override
    void login(){
        System.out.println("netflix free trailer");
    }
}
class Netflixpremium extends Netflix{
    @Override
    void watch(){
        System.out.println("Watch movies");
    }
}
class main{
    public static void main(String[] args) {
        Netflix user1 = new Netflixfree();
        user1.login();
        user1.watch();

    Netflix user2 = new Netflixpremium();
      user2.login();
      user2.watch();
    }
}
