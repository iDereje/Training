package zoo;

public class Dog extends  Animal{


  public Dog(boolean legs, boolean wings, String color, String category) {
    super(legs, wings, color, category);
  }


  public void sound(){
    System.out.println("Ruff Ruff");
  }
}
