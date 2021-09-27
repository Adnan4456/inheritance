import java.io.EOFException;

class Test{
    void show() throws  RuntimeException //parent exception that is unchecked.
    {
        System.out.println("1");
    }
}

public class Exceptions {
    //we can not throw checked exceptions.if we want then add tru catch block.
  void show() throws  ArithmeticException //child exception that is unchecked.
  {
    System.out.println("2");
  }

 public static void main(String[] args) {


   Test t = new Test();
   t.show();

   Exceptions exceptions = new Exceptions();

      exceptions.show();

 }
}
