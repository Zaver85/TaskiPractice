/*У класса City есть два поля - название города и текущая температура воздуха.
Также в классе taskiFrom0121To0140.task0121.taskiFrom0141To0160.task0141.Solution есть метод showWeather: он выводит в консоли информацию о погоде в городе,
который передан в качестве аргумента метода. Реализуй метод showWeather,
который должен выводить в консоли информацию в таком формате: В городе "название города" сегодня
температура воздуха "температура в городе"
В методе main один раз нужно вызвать метод showWeather с нужным аргументом.

Пример вывода:
В городе Дубай сегодня температура воздуха 40

Требования:
•	Не изменяй класс City.
•	В классе taskiFrom0121To0140.task0121.taskiFrom0141To0160.task0141.Solution должен быть метод showWeather с параметром City.
•	Метод showWeather должен использовать геттеры класса City.
•	Метод showWeather должен выводить текст в консоли в соответствии условию.*/

package taskiFrom0081To0100.task0098;

public class Solution {

    public static void showWeather(City city) {
        System.out.println("В городе " + city.getName() + " сегодня температура воздуха " + city.getTemperature());
    }

    public static void main(String[] args) {
        City city = new City("Дубай", 40);
        showWeather(city);
    }
}
