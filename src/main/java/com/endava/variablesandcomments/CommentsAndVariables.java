package com.endava.variablesandcomments;

public class CommentsAndVariables {
    public static void main(String[] args) {
// Declare the primitive data type variables
        boolean falseBooleanVariable;
        boolean trueBooleanVariable;
        char firstCharFromAscii;
        char lastCharFromAscii;
        byte lowerLimitOfByteDataType;
        byte upperLimitOfByteDataType;
        short lowerLimitOfShortDataType;
        short upperLimitOfShortDataType;
        int lowerLimitOfIntDataType;
        int upperLimitOfIntDataType;
        long lowerLimitOfLongDataType;
        long upperLimitOfLongDataType;
        float lowerLimitOfFloatDataType;
        float upperLimitOfFloatDataType;
        double  lowerLimitOfDoubleDataType;
        double upperLimitOfDoubleDataType;

//  Initialization of the above variables
        falseBooleanVariable = false;
        trueBooleanVariable = true;
        firstCharFromAscii = '\u0000';  // This is the value for 0 in Unicode (null character)
        lastCharFromAscii =  '\uFFFF';  // This is the value for 65,535 in Unicode
        lowerLimitOfByteDataType = -128;
        upperLimitOfByteDataType = 127;
        lowerLimitOfShortDataType = -32768;
        upperLimitOfShortDataType = 32767;
        lowerLimitOfIntDataType = -2147483648;
        upperLimitOfIntDataType = 2147483647;
        lowerLimitOfLongDataType =  -9223372036854775808L;
        upperLimitOfLongDataType = 9223372036854775807L;
        lowerLimitOfFloatDataType = -3.4E+38f;
        upperLimitOfFloatDataType = 3.4E+38f;
        lowerLimitOfDoubleDataType = -1.7E+308d;
        upperLimitOfDoubleDataType = 1.7E+308d;
        System.out.println("The value" +(int) lastCharFromAscii);
        System.out.println( "The value" +(int)firstCharFromAscii);
        System.out.println(falseBooleanVariable);
        System.out.println(trueBooleanVariable);
        System.out.println(lowerLimitOfByteDataType);
        System.out.println(upperLimitOfByteDataType);
        System.out.println(lowerLimitOfShortDataType);
        System.out.println(upperLimitOfShortDataType);
        System.out.println(lowerLimitOfIntDataType);
        System.out.println(upperLimitOfIntDataType);
        System.out.println(lowerLimitOfLongDataType);
        System.out.println(upperLimitOfLongDataType);
        System.out.println(lowerLimitOfFloatDataType);
        System.out.println(upperLimitOfFloatDataType);
        System.out.println(lowerLimitOfDoubleDataType);
        System.out.println(upperLimitOfDoubleDataType);



    }


}
