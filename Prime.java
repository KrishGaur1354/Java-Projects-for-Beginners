import java.util.Scanner;
class Prime{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int d=2;
        while(d<=n-1){
            if(n%d==0){
                System.out.println("Not Prime");
                return;
            }
            d=d+1;
        }
        System.out.println("Prime");
    }   
}