package com.剑指Offer;

/**
 * @description: TODO
 * @author: KimJun
 * @date: 19/1/20 15:41
 */
public class Page51 {
    public String replaceSpace(StringBuffer str) {
        int spaceNum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                spaceNum++;
            }
        }

        int indexOld = str.length() - 1;
        int indexNew = str.length() - 1 + (spaceNum * 2);
        str.setLength(indexNew + 1);
        while (indexOld != indexNew) {
            if (str.charAt(indexOld) == ' ') {
                str.setCharAt(indexNew--, '0');
                str.setCharAt(indexNew--, '2');
                str.setCharAt(indexNew--, '%');
            } else {
                str.setCharAt(indexNew--, str.charAt(indexOld));
            }
            indexOld--;
        }
        return str.toString();
    }

    public static void main(String[] args) {
        Page51 page51 = new Page51();
        StringBuffer buffer = new StringBuffer();
        buffer.append("We Are Happy");
        System.out.println( page51.replaceSpace(buffer));
    }
}
