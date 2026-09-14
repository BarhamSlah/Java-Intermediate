If you want to create an object of an inner class:
You need to reference the outer class that the inner class belongs to,
and you need an object of the outer class. That is when the inner class is not static.

But if it is static:
You don't need an object of the outer class; you just need to reference 
the outer class that it belongs to.

* static applies only to inner classes, not top-level outer classes.

***********************************************************************************************************************************************************************

 public class A{

    public void show(){
        IO.println("In Class A");
    }

  public static class B{
      public void show(){
          IO.println("In Class B");
      }

    }
}

void main(){

    /*
    WITH NOT STATIC INNER CLASS
    A a =new A();
    a.show();
    A.B b = a.new B();
    b.show();
     */

    /*
    WITH STATIC INNER CLASS
    A a =new A();
    a.show();
    A.B b = new A.B();
    b.show();
     */

}
