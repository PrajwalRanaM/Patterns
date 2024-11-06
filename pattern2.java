import java.util.Scanner;
public class pattern2 {
    private static void pat2(int num){
        for(int i=1;i<=num;i++){
            for(int j=1;j<=num;j++){
                if(i==1 || i==num|| j==1 ||j==num){
                    
                    System.out.print("* ");
                }
                else
                    
                    System.out.print("  ");
            }
           
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.print("enter number of rows: ");
        int num=obj.nextInt();
        pat2(num);
    }
}
