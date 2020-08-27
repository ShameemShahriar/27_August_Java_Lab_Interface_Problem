public class Square implements myShape{
    
    public int sideLenth;
    public Square(int sideLenth){
        this.sideLenth=sideLenth;
    }
    public void area(){
        int areaS=sideLenth*sideLenth;
        System.out.println("Square Area:"+areaS);
    }
    public void boundaryLenth(){
        int boundaryS=4*sideLenth;
        System.out.println("Square Boundary Lenath:"+boundaryS);
    }
}