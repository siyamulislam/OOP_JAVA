
package lab8;

/**
 *
 * @author Administrator
 */
public class Cylinder extends Circle{
    
    private double height;
    
public Cylinder(){
    
    
}

public Cylinder(double radius){
    
   this.radius=radius;
}

public Cylinder(double radius, double height){
    

    this.radius=radius;
    this.height=height;
}

    public double getHeight() {
        return height;
    }
    
    public double getVolume() {
        return radius*height;
    }
    
    public static void main(String[] args) {
       Cylinder c =new Cylinder(12, 10);
       Circle cr =new Circle();
       
        System.out.println(cr.getArea());
        System.out.println( c.getVolume());
        System.out.println();
        
    }

    
}
