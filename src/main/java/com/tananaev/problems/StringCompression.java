package com.tananaev.problems;

public class StringCompression {

    public int compress(char[] chars) {
        int writerIndex = 0;
        int startIndex = 0;
        for (int readerIndex = 1; readerIndex <= chars.length; readerIndex++) {
            if (readerIndex == chars.length || chars[readerIndex] != chars[startIndex]) {
                chars[writerIndex++] = chars[startIndex];
                if (readerIndex - startIndex > 1) {
                    String count = String.valueOf(readerIndex - startIndex);
                    for (char c : count.toCharArray()) {
                        chars[writerIndex++] = c;
                    }
                }
                startIndex = readerIndex;
            }

        }
        return writerIndex;
    }

}
