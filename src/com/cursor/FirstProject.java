package com.cursor;

/** In this class I`m training with arithmetic operations
 *  with primitives: byte, short, long, double, float,
 * and writing results of each operation into console
 */
public class FirstProject {

    public static void main(String[] args) {

        /* Input digits and doing arithmetic operation:
         * addition, subtraction, multiplying, dividing,
         */

        // Byte has a minimum value of -128 and a maximum value of 127 (inclusive)
        byte a = 19;
        byte b = 4;
        byte addByte = (byte) (a + b);
        byte subByte = (byte) (a - b);
        byte mulByte = (byte) (a * b);
        byte divByte = (byte) (a / b);

        //Short has a minimum value of -32,768 and a maximum value of 32,767
        short sh1 = 3213;
        short sh2 = 10;
        short addShort = (short) (sh1 + sh2);
        short subShort = (short) (sh1 - sh2);
        short mulShort = (short) (sh1 * sh2);
        short divShort = (short) (sh1 / sh2);

        //Int has a minimum value of -2^32 and a maximum value of 2^32 - 1
        int first = 10000;
        int second = 58;
        int addInt = first + second;
        int subInt = first - second;
        int mulInt = first * second;
        int divInt = first / second;

        //Long has a minimum value of -2^63 and a maximum value of 2^63-1
        long l = 2900000L;
        long l1 = 19908L;
        long addLong = l + l1;
        long subLong = l - l1;
        long mulLong = l * l1;
        long divLong = l / l1;

        //Double is a double-precision 64-bit IEEE 754 floating point
        double d = 1345.456d;
        double d1 = 123.677d;
        double addDouble = d + d1;
        double subDouble = d - d1;
        double mulDouble = d * d1;
        double divDouble = d / d1;

        //Float is a single-precision 32-bit IEEE 754 floating point.
        float f = 0.345f;
        float f1 = 2.0f;
        float addFloat = f + f1;
        float subFloat = f - f1;
        float mulFloat = f * f1;
        float divFloat = f / f1;

        /*
         *  Printing results
         */

        System.out.println("Byte:    \n" + a + " + " + b + " = " + addByte +
                                    "\n" + a + " - " + b + " = " + subByte +
                                    "\n" + a + " * " + b + " = " + mulByte +
                                    "\n" + a + " / " + b + " = " + divByte);
        System.out.println("Short:   \n" + sh1 + " + " + sh2 + " = " + addShort +
                                    "\n" + sh1 + " - " + sh2 + " = " + subShort +
                                    "\n" + sh1 + " * " + sh2 + " = " + mulShort +
                                    "\n" + sh1 + " / " + sh2 + " = " + divShort);
        System.out.println("Int:     \n" + first + " + " + second + " = " + addInt +
                                    "\n" + first + " - " + second + " = " + subInt +
                                    "\n" + first + " * " + second + " = " + mulInt +
                                    "\n" + first + " / " + second + " = " + divInt);
        System.out.println("Long:    \n" + l + " + " + l1 + " = " + addLong +
                                    "\n" + l + " - " + l1 + " = " + subLong +
                                    "\n" + l + " * " + l1 + " = " + mulLong +
                                    "\n" + l + " / " + l1 + " = " + divLong);
        System.out.println("Double:  \n" + d + " + " + d1 + " = " + addDouble +
                                    "\n" + d + " - " + d1 + " = " + subDouble +
                                    "\n" + d + " * " + d1 + " = " + mulDouble +
                                    "\n" + d + " / " + d1 + " = " + divDouble);
        System.out.println("Float:   \n" + f + " + " + f1 + " = " + addFloat +
                                    "\n" + f + " - " + f1 + " = " + subFloat +
                                    "\n" + f + " * " + f1 + " = " + mulFloat +
                                    "\n" + f + " / " + f1 + " = " + divFloat);
    }

}

