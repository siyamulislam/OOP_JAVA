package lab8;

/**
 *
 * @author Administrator
 */
public class Circle {

    double radius;
    private String color;

    public Circle() {
//        double radius = this.redius;
//       String color = this.color;
        radius= 45;
        color= "BLUE";
    }
    
    public Circle(double radius ) {
        radius = this.radius;
    }

    public double getRedius() {
        return radius;
    }
    
    public double getArea() {
        return (3.1416*radius);
    }

    

}
