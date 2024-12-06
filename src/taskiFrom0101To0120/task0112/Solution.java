/*В классе Outer есть внутренний (Inner) и вложенный (Nested) классы.
В методе main класса taskiFrom0121To0140.task0121.Solution создай по одному объекту каждого из них.

Требования:
•	В методе main класса taskiFrom0121To0140.task0121.Solution должен быть создан объект класса Inner.
•	В методе main класса taskiFrom0121To0140.task0121.Solution должен быть создан объект класса Nested.
•	Класс Outer изменять нельзя*/

package taskiFrom0101To0120.task0112;

public class Solution {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();

        Outer.Nested nested = new Outer.Nested();
    }
}
