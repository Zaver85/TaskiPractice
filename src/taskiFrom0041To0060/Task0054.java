/*В классе в методе countDown() происходит обратный отсчет.
Тебе нужно сделать так, чтобы между выводом текста в консоль была пауза в 1 секунду.
В этом тебе поможет метод sleep(long) класса Thread.

Требования:
        •	Реализуй метод countDown() согласно условию.*/

package taskiFrom0041To0060;

public class Task0054 {
    public static void main(String[] args) throws InterruptedException {
        countDown();
    }

    public static void countDown() throws InterruptedException {
        System.out.println("3");
        Thread.sleep(1000);
        System.out.println("2");
        Thread.sleep(1000);
        System.out.println("1");
        Thread.sleep(1000);
        System.out.println("Старт!");
    }
}
