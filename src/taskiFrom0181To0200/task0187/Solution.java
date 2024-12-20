/*При запуске программа заканчивается исключением. Но из текста исключения в консоли неясно, где оно возникло.
В этой задаче тебе нужно:

обернуть в try-catch код методов addIce, addVodka, addJuice и addOrange;
в блоках catch вызвать метод printBugMethodName и передать в него stack trace.
Если сделаешь все правильно, при запуске программы на экран выведутся имена методов, в которых возникает исключение.

Требования:
•	Нужно обернуть в try-catch код методов addIce, addVodka, addJuice и addOrange.
•	В методах addIce, addVodka, addJuice и addOrange в блоках catch нужно разместить одну команду - вызов метода printBugMethodName.
•	При каждом вызове метода printBugMethodName в него нужно передать текущий stack trace.*/

package taskiFrom0181To0200.task0187;

import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;


public class Solution {

    public static void main(String[] args) {
        Map<String, Integer> screwdriverIngredients = makeScrewdriver();
        String screwdriver = screwdriverIngredients.keySet().stream()
                .map(key -> key + "=" + screwdriverIngredients.get(key))
                .collect(Collectors.joining(", ", "{", "}"));
        System.out.println(screwdriver);
    }

    static Map<String, Integer> makeScrewdriver() {
        Map<String, Integer> ingredients = new TreeMap<>();
        addIce(ingredients);
        addVodka(ingredients);
        addJuice(ingredients);
        addOrange(ingredients);
        return ingredients;
    }

    static void addIce(Map<String, Integer> ingredients) {
        ingredients.put("ice cubes", 7);
    }

    static void addVodka(Map<String, Integer> ingredients) {
        try {
            ingredients.put("vodka", 50);
        } catch (Exception e) {
            printBugMethodName(Thread.currentThread().getStackTrace());
        }
    }

    static void addJuice(Map<String, Integer> ingredients) {
        try {
            ingredients.put(null, 100);
        } catch (Exception e) {
            printBugMethodName(Thread.currentThread().getStackTrace());
        }
    }

    static void addOrange(Map<String, Integer> ingredients) {
        try {
            ingredients.put("orange slice", 1);
        } catch (Exception e) {
            printBugMethodName(Thread.currentThread().getStackTrace());
        }
    }

    public static void printBugMethodName(StackTraceElement[] stackTraceElements) {
        StackTraceElement stackTraceElement = stackTraceElements[1];
        System.out.println(stackTraceElement.getMethodName());
    }
}
