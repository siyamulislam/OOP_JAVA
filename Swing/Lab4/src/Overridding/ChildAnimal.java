
package Overridding;


public class ChildAnimal extends Animal{
    private String name;

    public void demo(){
        System.out.println("This is Sub Animal");
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
            
            
            
            
    
    
}
