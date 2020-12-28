package com.zh.tools;


/**
 * -Xmx10m -XX:+UseSerialGC -XX:-UseCompressedOops
 */
public class JHSDB_TestCase {

    static class Test {
        static ObjectHolder staticObj = new JHSDB_TestCase.ObjectHolder();
        ObjectHolder instanceObj = new ObjectHolder();

        void fool() {
            ObjectHolder localObj = new ObjectHolder();
            System.out.println("done");
        }

    }

    private static class ObjectHolder {}

    public static void main(String[] args) {
        Test test = new JHSDB_TestCase.Test();
        test.fool();
    }
}
