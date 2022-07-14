import java.util.Scanner;

public class positivenegative {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int []a = new int[size];
        for(int j = 0;j<size;j++){
            a[j]=sc.nextInt();
        }
        for(int j =0;j<size;j++){
            if(a[j]<0){
                System.out.print(a[j] + " ");
            }else{
                System.out.print(a[j] + " ");
            }
        }

    }
    /*static void positive(int arr[]){
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                System.out.println(arr[i]);
            }
        }
    }
    static void negative(int arr[]){
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                System.out.println(arr[i]);
            }
        }
    }
     */
}
