import java.util.Scanner;

public class pattern6 {
    private static void pat6(int num){
        int k=1;
        for (int i=1;i<=num;i++){
            
           
            for (int j=1;j<=i;j++){
                System.out.print(k+" ");
                k++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.print("enter number of rows: ");
        int num=obj.nextInt();
        pat6(num);
    }
    
}
