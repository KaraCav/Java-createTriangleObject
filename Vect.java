public class Vect {
  //create coordinates
    private Integer x; 
    private Integer y;
    
    public Vect() { 
      this.x = 0;
      this.y = 0;
    }
   
    public Vect(Integer x,Integer y) {
      this.setX(x);
      this.setY(y);
    }
  //since our Integers are PRIVATE, we need a getter/setter
    // these control the flow of getting a value 
    public Integer getX() {
     return x; 
    }

    public void setX(Integer x) {
       this.x = x; 
      }
    
    
    public Integer getY() {
     return y; 
    }
    
    public void setY(Integer y) {
     this.y = y; 
    }
    
    public boolean valid() {
     return x != null && y != null; 
    }
    
    public void print() {
     System.out.println("X : " + " " + this.getX() + "Y : " + " " + this.getY()); 
    }
}
