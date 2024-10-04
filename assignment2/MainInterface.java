package assignment2;

interface InterfaceA {
    void methodA1();
    void methodA2();
}

interface InterfaceB {
    void methodB1();
    void methodB2();
}

interface InterfaceC {
    void methodC1();
    void methodC2();
}
interface CombinedInterface extends InterfaceA, InterfaceB, InterfaceC {
    void newMethod();
}
class ConcreteClass {
    void concreteMethod() {
        System.out.println("Concrete method in ConcreteClass");
    }
}
class MyClass extends ConcreteClass implements CombinedInterface {
    @Override
    public void methodA1() {
        System.out.println("Method A1");
    }

    @Override
    public void methodA2() {
        System.out.println("Method A2");
    }

    @Override
    public void methodB1() {
        System.out.println("Method B1");
    }

    @Override
    public void methodB2() {
        System.out.println("Method B2");
    }

    @Override
    public void methodC1() {
        System.out.println("Method C1");
    }

    @Override
    public void methodC2() {
        System.out.println("Method C2");
    }

    @Override
    public void newMethod() {
        System.out.println("New Method");
    }
}
public class MainInterface {
    static void useInterfaceA(InterfaceA a) {
        a.methodA1();
        a.methodA2();
    }

    static void useInterfaceB(InterfaceB b) {
        b.methodB1();
        b.methodB2();
    }

    static void useInterfaceC(InterfaceC c) {
        c.methodC1();
        c.methodC2();
    }

    static void useCombinedInterface(CombinedInterface ci) {
        ci.methodA1();
        ci.methodB1();
        ci.methodC1();
        ci.newMethod();
    }

    public static void main(String[] args) {
        MyClass myObject = new MyClass();
        useInterfaceA(myObject);
        useInterfaceB(myObject);
        useInterfaceC(myObject);
        useCombinedInterface(myObject);
    }
}
