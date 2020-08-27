public class Circle implements myShape{
    
    public int radius;
    public Circle(int radius){
        this.radius=radius;
    }
    public void area(){
        double areaC=3.1416*radius*radius;
        System.out.println("Square Area:"+areaC);
    }
    public void boundaryLenth(){
        double boundaryC=2*3.1416*radius;
        System.out.println("Square Boundary Lenath:"+boundaryC);
    }
}