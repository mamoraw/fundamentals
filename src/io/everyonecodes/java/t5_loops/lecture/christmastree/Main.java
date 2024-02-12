package io.everyonecodes.java.t5_loops.lecture.christmastree;

// base size parameter
public class Main {
    public static void main(String[] args) {
        System.out.println(makeTree(3));
    }

    //    public static String makeTree(int baseSize) {
//        String outPut = "";
//        for (int i = 1; i <= baseSize; i++) {
//            for (int j = 0; j < baseSize - i; j++) {
//                outPut = " ";
//            }
//            for (int j = 1; j <= i; j++) {
//                outPut += "* ";
//            }
//            outPut += "\n";
//        }
//        return outPut;
//    }
    public static String makeTree(int baseWidth) {
        String output = "";
        for (int i = 1; i <= baseWidth; i++) {
            for (int j = 0; j < baseWidth - i; j++) {
                output += " ";
            }
            // same as loop
            for (int j = 1; j <= i; j++) {
                output += "* ";
            }
            output += "\n";
        }
        return output;
    }
}

