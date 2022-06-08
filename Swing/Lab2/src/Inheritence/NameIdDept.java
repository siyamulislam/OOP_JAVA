
package Inheritence;
//Multilevel Inheritance

public class NameIdDept extends NameId {
      public String dept="CSE";
      public static void main(String[] args) {
          NameIdDept i= new NameIdDept();
          System.out.println(i.id+" "+i.name+ " "+i.dept);
          i.name();
          i.id();
    }
    
}
