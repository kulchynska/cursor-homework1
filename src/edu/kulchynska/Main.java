package edu.kulchynska;

public class Main {

    private static final String DELIMITER = "##############################";

    public static void main(String[] args) {
        byte b1 = 127;
        byte b2 = 3;

        byte bSum = (byte) (b1 + b2);
        byte bSub = (byte) (b1 - b2);
        byte bMul = (byte) (b1 * b2);
        byte bDiv = (byte) (b1 / b2);
        System.out.println("byte sum = " + bSum);
        System.out.println("byte subtraction = " + bSub);
        System.out.println("byte multiplication = " + bMul);
        System.out.println("byte division = " + bDiv);

        System.out.println(DELIMITER);

        short s1 = 32000;
        short s2 = 500;

        short sSum = (short) (s1 + s2);
        short sSub = (short) (s1 - s2);
        short sMul = (short) (s1 * s2);
        short sDiv = (short) (s1 / s2);
        System.out.println("short sum = " + sSum);
        System.out.println("short subtraction = " + sSub);
        System.out.println("short multiplication = " + sMul);
        System.out.println("short division = " + sDiv);

        System.out.println(DELIMITER);

        long l1 = 1000000L;
        long l2 = 100000L;

        long lSum = l1 + l2;
        long lSub = l1 - l2;
        long lMul = l1 * l2;
        long lDiv = l1 / l2;
        System.out.println("long sum = " + lSum);
        System.out.println("long subtraction = " + lSub);
        System.out.println("long multiplication = " + lMul);
        System.out.println("long division = " + lDiv);

        System.out.println(DELIMITER);

        float f1 = 100.2F;
        float f2 = 144.6F;

        float fSum = f1 + f2;
        float fSub = f1 - f2;
        float fMul = f1 * f2;
        float fDiv = f1 / f2;
        System.out.println("float sum = " + fSum);
        System.out.println("float subtraction = " + fSub);
        System.out.println("float multiplication = " + fMul);
        System.out.println("float division = " + fDiv);

        System.out.println(DELIMITER);

        double d1 = 132.5;
        double d2 = 69;

        double dSum = d1 + d2;
        double dSub = d1 - d2;
        double dMul = d1 * d2;
        double dDiv = d1 / d2;
        System.out.println("double sum = " + dSum);
        System.out.println("double subtraction = " + dSub);
        System.out.println("double multiplication = " + dMul);
        System.out.println("double division = " + dDiv);
    }

}
