/*В методе main найди и удали язык программирования Pascal из списка programmingLanguages.

Требования:
•	В методе main должен удаляться Pascal из списка programmingLanguages.*/

package taskiFrom0141To0160.task0145;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public static ArrayList<String> programmingLanguages = new ArrayList<>(Arrays.asList("C", "C++", "Python", "JavaScript", "Ruby", "Java", "Pascal"));

    public static void main(String[] args) {
        programmingLanguages.remove("Pascal");
        System.out.println(programmingLanguages);
    }
}
