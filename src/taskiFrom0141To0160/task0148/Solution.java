/*В классе Solution есть поле intArray, геттер и сеттер для него, и метод main с объявленными в нем переменными.
Тебе нужно заменить типы переменных с var на конкретный тип объекта (изменять названия и инициализацию объектов нельзя),
а также починить геттер и сеттер поля intArray.

Пример:
var console = new Scanner(System.in);
Заменить на:
Scanner console = new Scanner(System.in);

Требования:
•	Замени типы переменных c var на конкретный тип объекта.
•	Почини геттер и сеттер для поля intArray.*/

package taskiFrom0141To0160.task0148;

public class Solution {
    private int[] intArray = new int[4];

    public int[] getIntArray() {
        return this.intArray;
    }

    public void setIntArray(int[] intArray) {
        this.intArray = intArray;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String string = new String("Hello");
        StringBuilder stringBuilder = new StringBuilder();
    }
}
