/*Сделай все переменные класса Planet не статическими.
После этого внеси необходимые правки в метод main.

Требования:
•	Все переменные класса Planet должны быть не статическими.
•	В методе main должны присваиваться значения всем переменным объекта Planet earth.*/

package taskiFrom0101To0120.task0105;

public class Solution {

    public static void main(String[] args) {
        Planet earth = new Planet();
        earth.name = "Земля";
        earth.age = 4_540_000_000L;
        earth.speed = 170_218;
        earth.area = 510_072_000;
        earth.printInformation();
    }
}
