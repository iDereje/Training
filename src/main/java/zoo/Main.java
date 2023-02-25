package zoo;

public class Main {
  public static void main(String[] args) {
Animal animal = new Animal(true,true,"Colorfull","Earth,Sea,Water");
Dog tim = new Dog(true,false,"Brown","Mammal");
Cat tom = new Cat(true,false,"White/Silver","Mammal");


tim.sound();
tom.climb();
animal.mammal();


  }
}
