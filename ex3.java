import java.util.Scanner;
public class ex3 {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        String name=scan.nextLine();
        double score=scan.nextDouble();
        scan.nextLine();
        String dept=scan.nextLine();
        System.out.println("My Name Is " +name);
        System.out.println("My Score Is " +score/10);
        System.out.println("My Department Is " +dept);
        }
    
}
