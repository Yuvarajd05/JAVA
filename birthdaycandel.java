public class birthdaycandel {
    public static void main(String[] args) {
int [] arr = {4,4,1,3};
int max=0;
int count=0;

for(int i=0;i<arr.length;i++){
    if(arr[i]>=max){
        max=arr[i];
        count++;
    }
}
System.out.println("maximum values is "+max);
System.out.println("Count is "+count);
    }
}