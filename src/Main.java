import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("Sayınızı giriniz:");
        int i=1;
        int n = inp.nextInt();
        System.out.println("4'ün kuvvetleri:");
        while(i<=n){
            System.out.print(i+",");
            i*=4;
        }
        System.out.println("");
        System.out.println("5'in kuvvetleri");
        i=1;
        while (i<=n){
            System.out.print(i+",");
            i*=5;
        }



    }
}