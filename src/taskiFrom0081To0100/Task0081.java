/*Нужно реализовать 2 метода, используя StringBuilder: addTo(String, String[]),
replace(String, String, int, int).

Метод addTo(String, String[]) добавляет к строке, полученной первым параметром,
все строки по порядку из массива строк, полученного вторым параметром, и возвращает
объект типа StringBuilder на основе этой строки.
Чтобы добавить новое значение к существующему объекту типа StringBuilder, нужно вызвать
у него метод append(String), в который передать это новое значение.
Метод replace(String, String, int, int) заменяет часть строки, полученной первым параметром,
начиная с индекса, полученного третьим параметром, и заканчивая индексом, полученным четвертым параметром,
на строку, полученную вторым параметром, и возвращает объект типа StringBuilder на основе этой строки.
Чтобы заменить часть значения объекта типа StringBuilder, нужно у него вызвать метод
replace(int, int, String), в который передать начальную и конечную позицию для замены, а также новое значение.
Требования:
•	Нужно, чтобы метод addTo(String, String[]) был реализован согласно условию.
•	Нужно, чтобы метод replace(String, String, int, int) был реализован согласно условию.*/

package taskiFrom0081To0100;

public class Task0081 {
    public static void main(String[] args) {
        String string = "Учиться, учиться и еще раз учиться! ";

        System.out.println(addTo(string, new String[]{"Под ", "лежачий ", "камень ", "вода ", "не ", "течет"}));
        System.out.println(replace(string, ", ", 16, 27));
    }

    public static StringBuilder addTo(String string, String[] strings) {
        StringBuilder stringBuilder = new StringBuilder(string);
        for (String s : strings) {
            stringBuilder.append(s);
        }
        return stringBuilder;
    }

    public static StringBuilder replace(String string, String str, int start, int end) {
        StringBuilder stringBuilder = new StringBuilder(string);
        stringBuilder.replace(start, end, str);
        return stringBuilder;
    }
}
