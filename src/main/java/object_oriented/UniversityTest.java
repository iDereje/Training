package object_oriented;

public class UniversityTest {
  public static void main(String[] args) {
    Student mathStudent = new Student(1995,"John", "Smith") ;
    Student englishStudent = new Student(1998,"More", "Dane") ;
    Driver driver1 = new Driver(1995,"Joe");
    Driver driver2 = new Driver(1994,"John");


    mathStudent.setDataBase("Hebrew",98);
    mathStudent.setDataBase("english",90);

    mathStudent.setDataBase("Hebrew",98);
    mathStudent.setDataBase("Sport",55);
    driver1.setDataBase("Math",87);
    driver2.setDataBase("Jay z" , 90 );
    int lisenceLevel = driver1.getLicence();
    driver2.getLicence();
    System.out.println("lisince level = "+lisenceLevel);





  }
}
