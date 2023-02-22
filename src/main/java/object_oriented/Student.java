package object_oriented;

public class Student extends Person {
  public Student(int year, String  fName, String lName) {
    int birthYear = year;
    String firstName = fName;
    String lastName = lName;
  }

  public void   setDataBase(String courseName , int grade ){
    System.out.println("Set DB with parameters " + courseName + " in grade " + grade);
    Student mathStudent = new Student(1995,"John","Smith");
    Student englishStudent = new Student(2000,"David","Backham");
    Driver driver1 = new Driver(1995,"Joe");

    mathStudent.setDataBase("Hebrew",98);
    mathStudent.setDataBase("Sport",55);
    driver1.setDataBase("Math",87);
    int lisenceLevel = driver1.getLicence();
    System.out.println("lisince level = "+lisenceLevel);

  }

}
