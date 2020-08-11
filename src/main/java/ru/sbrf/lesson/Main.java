package ru.sbrf.lesson;

public class Main {
    public static void main(String[] args) {
        System.out.println("3 + 4 = " + summaByteAndShort((byte) 3, (short) 4));
        System.out.println("3 * 4 = " + compositionIntAndLong(3, 4));
        System.out.println("max(3,4) = " + getMaxNumber(3, 4));
        System.out.println("Это \'A\' ? " + isCharA('A'));
        System.out.println("Это \'3\' цифрв? " + isCharNumber('3'));
        binary0to30();
        test_MAX_VALUE();
        System.out.println("(int)\'A\' = " + convertCarToInt('A'));
        System.out.println("(char)99 = \'" + convertIntToChar(99) + "\'");
    }

    public static byte summaByteAndShort(byte b, short s) {
        return (byte) (b + s);
    }

    public static int compositionIntAndLong(int i, long l) {
        return (int) (i * l);
    }

    public static int getMaxNumber(int i1, int i2) {
        return i1 > i2 ? i1 : i2;
    }

    public static boolean isCharA(char c) {
        return (c == 'A' || c == 'А');
    }

    public static boolean isCharNumber(char c) {
        return ('0' <= c && c <= '9');
    }

    public static void binary0to30() {
        for (int i = 0; i <= 30; ++i) {
            System.out.println(i + " = 0b" + Integer.toBinaryString(i));
        }
    }

    public static void test_MAX_VALUE() {
        Integer i = Integer.MAX_VALUE;
        System.out.println("i=" + i + " \ti=0b" + Integer.toBinaryString(i++));
        System.out.println("i=" + i + " \ti=0b" + Integer.toBinaryString(i));
    }

    public static int convertCarToInt(char c) {
        return (int) c;
    }

    public static char convertIntToChar(int i) {
        return (char) i;
    }
}

