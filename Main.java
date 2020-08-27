import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sin=new Scanner(System.in);
        System.out.println("Press 1 for Triangle,2 for Sqauare, 3 for circle");
        int n=sin.nextInt();
        if(n==1){
            System.out.println("Enter base, height:");
            int base=sin.nextInt();
            int height=sin.nextInt();
            Triangle t=new Triangle(base,height);
            t.area();
            t.boundaryLenth();
        }
        else if(n==2){
            System.out.println("Enter Side lenth:");
            int lenth=sin.nextInt();
            Square s=new Square(lenth);
            s.area();
            s.boundaryLenth();
        }
        else if(n==3){
            System.out.println("Enter radius:");
            int radius=sin.nextInt();
            Circle c= new Circle(radius);
            c.area();
            c.boundaryLenth();
        }

    }
}