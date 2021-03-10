package com.examination.question;

import com.examination.question.service.BuildUpLetters;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.Assert;


@SpringBootTest
class QuestionApplicationTests {

    @Test
    public void combinationLetter1() {
        BuildUpLetters combination = new BuildUpLetters("2", "9","8");
        String[] strings = combination.getAllLetters();
        for (String str : strings) {
            System.out.print(str + " ");
        }
        Assert.assertEquals(strings.length, 3 * 4 * 3);
    }

    @Test
    public void combinationLetter2() {
        BuildUpLetters combination = new BuildUpLetters("2", "99");
        String[] strings = combination.getAllLetters();
        for (String str : strings) {
            System.out.print(str + " ");
        }
        Assert.assertEquals(strings.length, 3 * 4 * 4);
    }

    @Test
    public void combinationLetter3() {
        BuildUpLetters combination = new BuildUpLetters("0", "2");
        String[] strings = combination.getAllLetters();
        for (String str : strings) {
            System.out.print(str + " ");
        }
        Assert.assertEquals(strings.length, 1 * 3);
    }

    @Test
    public void combinationLetter4() {
        BuildUpLetters combination = new BuildUpLetters("0", "12345");
        String[] strings = combination.getAllLetters();
        for (String str : strings) {
            System.out.print(str + " ");
        }
        Assert.assertEquals(strings.length, 1 * 1 * 3 * 3 * 3 * 3);
    }

    @Test
    public void combinationLetter5() {
        BuildUpLetters combination = new BuildUpLetters("3", "a","BA");
        String[] strings = combination.getAllLetters();
        for (String str : strings) {
            System.out.print(str + " ");
        }
    }

}
