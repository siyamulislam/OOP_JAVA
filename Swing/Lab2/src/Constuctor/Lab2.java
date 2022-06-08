
package Constuctor;


public class Lab2 {
    public static void main(String[] args) {
     ConstuctorExam con =new ConstuctorExam(); //Default Constuctor
      ParameterConstuctor paraCon =new ParameterConstuctor(171158865, "Siam");
    //Parametereist Constuctor
        System.out.println(paraCon.id+" "+paraCon.name);
    }
}