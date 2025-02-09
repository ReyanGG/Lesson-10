interface M {

    public void m1();

    public void m2();

}

public class MI implements M {
    public void m1() {
        System.out.println("implement m1");
    }

    public void m2() {
        System.out.println("implement m2");
    }

    public static void main(String[] args) {
        MI obj = new MI();
        obj.m1();
        obj.m2();

    }

}