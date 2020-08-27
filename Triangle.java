import java.lang.*;

public class Triangle implements myShape{
    
    public int base,height;
    public Triangle(int base, int height){
        this.base=base;
        this.height=height;
    }
    public void area(){
        double areaT=0.5*base*height;
        System.out.println("Square Area:"+areaT);
    }
    public void boundaryLenth(){
        double boundaryT=height+base+(Math.sqrt(height*base));
        System.out.println("Triangle Boundary Length:"+boundaryT);
        
    }
}