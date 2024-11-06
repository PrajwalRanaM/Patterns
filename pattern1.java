import java.util.Scanner;
public class pattern1 {
    private static void pattern(int num){
        int temp=1;
        for(int i=1;i<=num;i++){
            for(int j=1;j<=i;j++){
                if(temp%2==0){
                    System.out.print("0 ");
                }
                else
                    System.out.print("1 ");

                temp++;
            }
            System.out.println();
            
        }
    }

    public static void main(String[] args){
        System.out.print("enter no of rows:");
        Scanner obj=new Scanner(System.in);
        int num=obj.nextInt();
        pattern(num);
    }  
}
