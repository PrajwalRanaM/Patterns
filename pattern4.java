import java.util.Scanner;
public class pattern4 {
    private static void pat4(int num){
        for (int i=1;i<=num;i++){
           
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
        pat4(num);
    }
}
