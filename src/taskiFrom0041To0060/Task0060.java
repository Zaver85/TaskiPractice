/*Реализуй методы:

setFlag(int number, int flagPos) — устанавливает значение "1" биту под индексом flagPos
числа number и возвращает новое значение.
resetFlag(int number, int flagPos) — устанавливает значение "0" биту под индексом flagPos
числа number и возвращает новое значение.
checkFlag(int number, int flagPos) — проверяет значение бита под индексом flagPos
числа number и возвращает true, если значение "1" и false, если "0".
Требования:
        •	Реализуй метод setFlag(int, int) согласно условию.
        •	Реализуй метод resetFlag(int, int) согласно условию.
        •	Реализуй метод checkFlag(int, int) согласно условию.*/

package taskiFrom0041To0060;

public class Task0060 {
    public static int setFlag(int number, int flagPos) {
        number = number | (1 << flagPos);
        return number;
    }

    public static int resetFlag(int number, int flagPos) {
        number = number & ~(1 << flagPos);
        return number;
    }

    public static boolean checkFlag(int number, int flagPos) {
        return (number & (1 << flagPos)) == (1 << flagPos);
    }
}
