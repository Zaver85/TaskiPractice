/*Объедини блоки catch с одинаковым кодом.

Требования:
•	Количество блоков catch должно быть минимальным.*/

package taskiFrom0181To0200.task0186;

public class Solution {

    public static void main(String[] args) {
        try {
            System.out.println("Программа работает от забора");
            Thread.sleep(1000);
            System.out.println("до обеда");
        } catch (NumberFormatException | NullPointerException e) {
            System.out.println("Произошло исключение на букву N");
        } catch (InterruptedException | IllegalStateException | IllegalArgumentException e) {
            System.out.println("Произошло исключение на букву I");
        } catch (ClassCastException e) {
            System.out.println("Произошло исключение на букву C");
        }
    }
}
