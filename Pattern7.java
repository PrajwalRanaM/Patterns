import java.util.Scanner;
public class pattern7 {
    private static void pat7(int num){
        for( int i=1;i<6;i++){
            for(int j=1;j<6;j++){
                if(i==j||(i+j)==num+1)
                    System.out.print(j);
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter a number to draw cross: ");
        int num=obj.nextInt();
        pat7(num);
    }
    
    
}
