package com.examination.question.service;

/**
 * Enumeration class corresponding to numbers and letters
 * @Link http://www.xxx.com/
 * @Copyright xxx (c) 2021 xxx Ltd
 * @Author JieYingCong
 * @Date 2021年3月10日
 * @Time: 14:10:00
 */
public enum NumControlLetter {

    TWO("2", "A", "B", "C"),
    THREE("3", "D", "E", "F"),
    FOUR("4", "G", "H", "I"),
    FIVE("5", "J", "K", "L"),
    SIX("6", "M", "N", "O"),
    SEVEN("7", "P", "Q", "R", "S"),
    EIGHT("8", "T", "U", "V"),
    NINE("9", "W", "X", "Y", "Z");

    private String numeral;

    private String[] letters;

    NumControlLetter(String numeral, String... letters) {
        this.numeral = numeral;
        this.letters = letters;
    }

    /**
     * Returns the enumeration object of the enumeration numerical hit
     * @param numeral
     * @return
     */
    public static NumControlLetter getNumControlLetter(String numeral) {
        for (NumControlLetter ncl : NumControlLetter.values()) {
            if (ncl.getNumeral().equalsIgnoreCase(numeral)) {
                return ncl;
            }
        }
        return null;
    }

    public String getNumeral() {
        return numeral;
    }

    public String[] getLetters() {
        return letters;
    }
}
