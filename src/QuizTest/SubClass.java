package QuizTest;
/**
 * @author BAO 6/23/2023
 */
class SubClass extends SuperClass {
  private String member = "Bao";
  private int number = 1;

  public SubClass() {
  }

//  public void foo() {
//    System.out.println("In SubClass.foo(): " + member.toLowerCase());
//  }
  public void foo(){
    System.out.println(number);
  }
}
