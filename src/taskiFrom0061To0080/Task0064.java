/*В классе объявлены четыре публичных поля, которые соответствуют четырем
целочисленным типам. При объявлении эти поля инициализируются разными значениями — целочисленными литералами.
Но программа не компилируется, и нужно это исправить. Для этого внеси минимальные
изменения в значения полей так, чтобы тип переменной соответствовал типу целочисленного литерала.
Можно изменять только знак и тип литерала, не изменяя цифры и их порядок.

Требования:
•	Измени литерал инициализации поля b согласно условию.
•	Измени литерал инициализации поля s согласно условию
•	Измени литерал инициализации поля i согласно условию
•	Измени литерал инициализации поля l согласно условию*/

package taskiFrom0061To0080;

public class Task0064 {
    public byte b = -128;
    public short s = -32768;
    public int i = 1_234_567_890;
    public long l = 2_345_678_900L;
}
