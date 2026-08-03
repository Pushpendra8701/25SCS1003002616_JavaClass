import java.util.*;
public class Question3 {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int Principle = sc.nextInt();
    int Rate = sc.nextInt();
    int Time = sc.nextInt();
    int SimpleInterest = (Principle*Rate*Time)/100;
    System.out.println(SimpleInterest);
    sc.close();
    }
}