public class decimaltohexadecimal {
    public static void main(String[] args) {
        int n=999;
        String hexa = " ";
        while(n!=0){
            int rem=n%16;
            if(rem<=9){
                hexa=rem+hexa;
            }
            else{
                hexa=(char)(rem+55)+hexa;
                n=n/16;
            }
        }
        System.out.println(hexa);
            }
            }