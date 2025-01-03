/*В методе main(String[]) выведи на экран все числа из трехмерного массива multiArray.

Требования:
        •	В классе должна быть публичная статическая переменная multiArray типа int[][][].
        •	В методе main(String[]) выведи на экран все числа из multiArray.*/

package taskiFrom0001To0020;

public class Task0008 {
    public static int[][][] multiArray = new int[][][]{{{4, 8, 15}, {16}}, {{23, 42}, {}}, {{1}, {2}, {3}, {4, 5}}};

    public static void main(String[] args) {
        for (int i = 0; i < multiArray.length; i++) {
            for (int j = 0; j < multiArray[i].length; j++) {
                for (int k = 0; k < multiArray[i][j].length; k++) {
                    System.out.print(multiArray[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println("----------");
        }
    }
}
