package zoo;

public class Animal {
  boolean legs;
  boolean wings;
  String color;
  String category;

  public Animal(boolean legs, boolean wings, String color, String category) {
    this.legs = legs;
    this.wings = wings;
    this.color = color;
    this.category = category;
  }

  public void mammal() {


    System.out.println("Mammals\n" +
            "Mammals are vertebrates within the class Mammalia which have" +
            " a neocortex (i.e., higher brain functions), hair, three middle ear bones, " +
            "and mammary glands. Explore different types of mammals in the animal kingdom and their characteristics.");

  }
  public void birds(){
    System.out.println("Birds are a collection of warm-blooded vertebrates within the class Aves, " +
            "identified by feathers, toothless, beaked jaws, the laying of hard-shelled eggs, a " +
            "four-chambered heart, and a well-built yet lightweight skeleton system");
  }
  public void reptiles(){
    System.out.println("");
  }
}
