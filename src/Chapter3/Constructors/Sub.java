package Chapter3.Constructors;

public class Sub extends Super {

  int y;

  Sub(int x, int y) {
    this(x);

  }

  Sub(int x) {
    super(x);
    y = x;
  }
}
