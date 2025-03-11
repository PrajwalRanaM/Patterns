import java.util.Scanner;
public class Pattern7 {
    private static void pat7(int num){
        for( int i=1;i<num+1;i++){
            for(int j=1;j<num+1;j++){
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
        System.out.print("enter a odd number to draw cross: ");
        int num=obj.nextInt();
        pat7(num);
    }
    
    
}
