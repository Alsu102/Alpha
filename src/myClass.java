//this class tests the program
//a driver program

public class myClass {

  public static void main(String[] args) {
    Widget w1 = new Widget("Widget 1");
    System.out.println(w1.toString());
    Widget w2 = new Widget("Widget 2");
    System.out.println(w2.toString());

    for (ItemType it : ItemType.values()) {
      System.out.println(it + " " + it.AM);
    }

  }

}

class Widget extends Product {

  public Widget(String name) {
    super(name);
  }
}
