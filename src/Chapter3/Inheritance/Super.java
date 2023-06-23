package Chapter3.Inheritance;

public class Super {

  protected void bar() {
    System.out.println("Super.bar()");
  }

  protected String text;

  public Super(String text){
    this.text = text;
  }

  public Super(){

  }
}
