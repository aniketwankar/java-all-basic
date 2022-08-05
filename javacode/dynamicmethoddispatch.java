
class Phone {
    public void name() {
        System.out.println("my name is java");
    }

    public void greating() {
        System.out.println("Good morning ");
    }
}

class Smartphone extends Phone {
    public void name() {
        System.out.println("my name is java in class two");
    }

    public void swagat() {
        System.out.println("apka swagat hai");
    }
}

public class dynamicmethoddispatch {
    public static void main(String[] args) {
        Phone obj = new Smartphone();
        obj.name();

        obj.greating();

    }
}
