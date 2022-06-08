
package lab7;

/**
 *
 * @author Administrator
 */
public class NEwClass implements First{

    @Override
    public void demo1() {
        System.out.println("Method demo1");
    }

    @Override
    public void demo2() {
        System.out.println("Method demo2");
    }
    public static void main(String[] args) {
        NEwClass n= new NEwClass();
        
        n.demo1();
        n.demo2();
        
    }
    
}
