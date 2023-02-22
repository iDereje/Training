package object_oriented;

public class Driver extends Person {
  public Driver(int year , String name) {
    int birthYear = year ;
    String fulllName = name ;
  }
  public void setDataBase(String nameCourse , int grade ){
    System.out.println("Set DB with parameters "+nameCourse+" with grade  " + grade);

  }

  public int getLicence(){
    System.out.println("into get license");
    int licenseLevel = 5;
    return licenseLevel;
  }
}





