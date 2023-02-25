package zoo;

public class Cat extends Animal{


  public Cat(boolean legs, boolean wings, String color, String category ) {

    super(legs, wings, color, category);
  }




  public void climb(){
  System.out.println("Cats Are good At Climb");
}

  public void run(){
    System.out.println("Cats run very fast ");
  }
}
