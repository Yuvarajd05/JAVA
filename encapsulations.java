public class encapsulations{
    private int AccNo;
    private int IFSC;
    public int getAccNO(){
        return AccNo;
    }
        public int getIFSC(){
        return IFSC;
}
public void setAccNo(int AccNO){
    this.AccNo=AccNO;
}
public static void main(String[]args){
    encapsulations p1 = new encapsulations();
    encapsulations p2 = new encapsulations();
    p1.AccNo= 55;
    p2.IFSC = 56789;
    System.out.println(p1.getAccNO());
    System.out.println(p2.getIFSC());
}
}
