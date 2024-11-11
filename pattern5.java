import java.util.Scanner;

public class pattern5 {
        private static void pat5(int num){
        for (int i=num;i>=1;i--){
           
            for (int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.print("enter number of rows: ");
        int num=obj.nextInt();
        pat5(num);
    }
    
}
