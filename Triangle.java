public class Triangle {

  private Vect vect1; // if you did public static, it would set that value for all objs
  private Vect vect2;
  private Vect vect3;
      
      public Triangle(){}  // creates Triangle constructor
// is a DEFAULT constructor and NOT necessary since all objs already have properties
      
      public Triangle(Vect vect1, Vect vect2, Vect vect3){
       this.vect1 = vect1; 
       this.vect2 = vect2; 
       this.vect3 = vect3; 
      }
      
      public Vect getVect1() {
       return vect1; 
      }
      
      public void setVect1(Vect vect1){
        if(vect1.valid()){
          this.vect1 = vect1; 
        }
      }   
      public Vect getVect2() {
       return vect2; 
      }
      
      public void setVect2(Vect vect2){
        if(vect2.valid()){
          this.vect2 = vect2; 
         }
      }
      
      public Vect getVect3() {
       return vect3; 
      }
      public void setVect3(Vect vect3){
       if(vect3.valid()){
         this.vect3 = vect3;
       }
      }
      
      public void print() {
       System.out.print("Vect1 : ");
       this.vect1.print();
       System.out.print("Vect2 : ");
       this.vect2.print();
       System.out.print("Vect3 : ");
       this.vect3.print();
      }
}
