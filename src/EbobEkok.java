import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.print("sayi 1: ");
        a = sc.nextInt();
        System.out.print("Sayi 2: ");
        b = sc.nextInt();
        int ebob = 0,ekok = 0;
        int i =1;
        while (i<=a){
            if(a%i == 0 && b%i==0){
                ebob = i;
                i++;
            }else{
                i++;
            }
        }
        System.out.println("Ebob: " + ebob);
        int j = 1;
        while(j<=a*b){
            if(j%a==0 && j%b==0){
                ekok = j;
                j++;
                break;
            }else{
                j++;
            }
        }
        System.out.println("Ekok: "+ ekok);
    }
}
