package com.examination.question.service;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import static java.util.regex.Pattern.compile;

/**
 * Combining letters
 * @Link http://www.xxx.com/
 * @Copyright xxx (c) 2021 xxx Ltd
 * @Author JieYingCong
 * @Date 2021年3月10日
 * @Time: 14:10:00
 */
public class BuildUpLetters {
    private List<String> numeralList = new ArrayList<>();

    private List<String[]> lettersList = new ArrayList<>();


    /**
     * Determine whether the transferred number is in the enumeration class.
     * If it exists, add the enumeration value to the member variables digitList and lettersList.
     * If it does not exist, determine whether it is a number.
     * If it is a number, disassemble it into a single number and then start the enumeration.
     * Get enumerated data from the class and add it to the member variables digitList and lettersList
     * @param numerals
     */
    public BuildUpLetters(String... numerals) {
        for (String numeral : numerals) {
            NumControlLetter ncl = NumControlLetter.getNumControlLetter(numeral);
            if (ncl != null) {
                setNumControlLetter(ncl);
            } else if (isNumber(numeral)) {
                char[] digitCharArray = numeral.toCharArray();
                for (char numeralChar : digitCharArray) {
                    NumControlLetter nclAdhesion = NumControlLetter.getNumControlLetter(String.valueOf(numeralChar));
                    if (nclAdhesion != null) {
                        setNumControlLetter(nclAdhesion);
                    }
                }
            }
        }
    }

    /**
     * Add the numbers of the enumeration class and the letters it represents
     * to the member variables numericalList and lettersList
     * @param ncl
     */
    private void setNumControlLetter(NumControlLetter ncl) {
        numeralList.add(ncl.getNumeral());
        lettersList.add(ncl.getLetters());
    }

    /**
     * Integrate a collection of strings in a loop
     * @return
     */
    public String[] getAllLetters() {
        String[] crossLetterArr = new String[1];
        for (String[] letters : lettersList) {
            crossLetterArr = crossAssemble(crossLetterArr, letters);
        }
        return crossLetterArr;
    }

    /**
     * Cycle the characters added in the last round, and continue to add characters
     * to the "cross combination"
     * @param strArr1
     * @param strArr2
     * @return
     */
    private String[] crossAssemble(String[] strArr1, String[] strArr2) {
        String[] crossLetterArr = new String[strArr1.length * strArr2.length];
        for (int i = 0; i < strArr1.length; i++) {
            for (int n = 0; n < strArr2.length; n++) {
                crossLetterArr[i + strArr1.length * n] = splicingValue(strArr1[i], strArr2[n]);
            }
        }
        return crossLetterArr;
    }

    /**
     * Determine whether the current character is a number
     * @param str
     * @return
     */
    public static boolean isNumber(String str) {
        Pattern pattern = compile("[0-9]*");
        return pattern.matcher(str).matches();

    }

    /**
     * Concatenated characters
     * @param s1
     * @param s2
     * @return
     */
    private String splicingValue(String s1, String s2) {
        if (s1 == null || "".equals(s1)) s1 = "";
        if (s2 == null || "".equals(s2)) s2 = "";
        return s1 + s2;
    }

}
