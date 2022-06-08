
package Overridding;


public class TestOverridding {
    public static void main(String[] args) {
        ChildAnimal b= new ChildAnimal();
        Animal a=new Animal();
        b.demu();
        b.setName("Tiger");
        System.out.println( b.getName());
                
       
        
    }
}
