package zoo;

public class Cat extends Animal{
  String climb ;

  public Cat(boolean legs, boolean wings, String color, String category) {
    super(legs, wings, color, category);
  }


  public void run(){
    System.out.println("Cats run very fast ");
  }
}
