package zoo;

public class Animal {
  boolean legs;
  boolean wings;
  String color;
  String category ;
  public Animal(boolean legs , boolean wings, String color ,String category){
 this.legs = legs ;
 this.wings = wings ;
 this.color = color ;
 this.category = category ;
  }
boolean walk(){
  System.out.println("This animal can walk");
  return true;
}





}
