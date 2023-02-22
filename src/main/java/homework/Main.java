package homework;

public class Main {
  public static void main(String[] args) {
    Person person = new Person();
    Teacher teacherDavid = new Teacher();
    teacherDavid.teacherDavid();
    Student omer = new Student();
    Student dana = new Student();


    dana.setFirstName("dana");
    dana.setLastName("markes");
    omer.setFirstName("Omer");
    System.out.println(omer.firstName);
    omer.sleep();

    }

  }

