package taskiFrom0101To0120.task0112;

public class Outer {
    class Inner {
        Inner() {
            System.out.println("Создание объекта внутреннего класса");
        }
    }
    static class Nested {
        Nested() {
            System.out.println("Создание объекта вложенного класса");
        }
    }
}
