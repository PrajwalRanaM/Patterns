import java.util.Scanner;

public class pattern3 {

    private static void pat3(int num){
        for (int i=1;i<=num;i++){
            for(int k=num-i; k>0;k--){
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.print("enter number of rows: ");
        int num=obj.nextInt();
        pat3(num);
    }
    
}
