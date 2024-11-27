/*В этой задаче тебе предстоит реализовать метод generateNumber(), который будет
возвращать случайное число от 0 до 99.
В методе generateNumber() используй метод Math.random().

Требования:
        •	В классе должен быть публичный статический метод generateNumber()
        с типом возвращаемого значения int.
        •	Реализуй метод generateNumber() согласно условию.*/

package taskiFrom0041To0060;

public class Task0050 {
    public static void main(String[] args) {
        System.out.println(generateNumber());
    }

    public static int generateNumber() {
        int num = (int) ((Math.random() * 99) + 1);//напишите тут ваш код
        return num;
    }
}
