/*В публичный статический метод init(char[]) передается массив символов размером 9,
который нужно заполнить следующими символами:
        0 - '\u00A9'
        1 - '\u004A'
        2 - '\u0061'
        3 - '\u0076'
        4 - '\u0061'
        5 - '\u0052'
        6 - '\u0075'
        7 - '\u0073'
        8 - '\u0068'

Чтобы посмотреть результат, запусти метод main().

Требования:
•	Нужно, чтобы метод init(char[]) заполнял полученный массив символов согласно условию.*/

package taskiFrom0061To0080;

public class Task0073 {
    public static void main(String[] args) {
        char[] symbols = new char[9];
        init(symbols);
        System.out.println(new String(symbols));
    }

    public static void init(char[] symbols) {
        symbols[0] = '\u00A9';
        symbols[1] = '\u004A';
        symbols[2] = '\u0061';
        symbols[3] = '\u0076';
        symbols[4] = '\u0061';
        symbols[5] = '\u0052';
        symbols[6] = '\u0075';
        symbols[7] = '\u0073';
        symbols[8] = '\u0068';
    }
}
