package homework;

public class Person {
  String firstName ;
  String lastName ;
  long id ;
  long phoneNumber ;
  boolean married ;
  boolean employed ;



  public Person() {
    this.firstName = firstName ;
    this.lastName = lastName ;
    this.id = id ;
    this.phoneNumber = phoneNumber ;
    this.married = married ;
    this.employed = employed ;
  }
  public void setFirstName(String firstName){
    this.firstName = firstName ;

  }
  public void setLastName(String lastName){
    this.lastName = lastName;
  }
  public void setId(long id){
    this.id = id ;
  }
  public  void setPhoneNumber(long phoneNumber){
    this.phoneNumber = phoneNumber ;
  }

  public void setMarried(boolean married) {
    this.married = married;
  }

  public void setEmployed(boolean employed) {
    this.employed = employed;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public long getId() {
    return id;
  }

  public long getPhoneNumber() {
    return phoneNumber;
  }

  public boolean isMarried() {
    return married;
  }

  public boolean isEmployed() {
    return employed;
  }

  public void eat(){
    System.out.println("People are generally carnivors , vegetarian");
  }
  public void sleep(){
    System.out.println("You need to sleep 8 Hours A day ");
  }
  public void walk(){
    System.out.println("A Person needs to walk  few  hours per day to stay healty  ");
  }

}