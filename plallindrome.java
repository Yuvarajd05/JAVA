public class plallindrome{
    public static void main(String[] args) {
        int n=151;
        int rev=0;
        int org=n;
        while(n!=0){
            int rem =n%10;
            rev=rev*10+rem;
            n=n/10;

        }
if(rev==org){
    System.out.println("pallindrom");
}else{
    System.out.println("not");
}
}
}