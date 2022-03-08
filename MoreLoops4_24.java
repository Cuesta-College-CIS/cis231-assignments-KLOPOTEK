import java.util.Scanner;

public class MoreLoops4_24 {
    
    
   public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int sum=0;
    int cnt=0;
    int x;
    x = sc.nextInt();
    if(x<100){
        while(sum + x <100){
            sum+=x;
            cnt++;
            x =sc.nextInt();
        }
    }
    sc.close();
    System.out.printf("%d\t%d\n", sum, cnt);
}
}
