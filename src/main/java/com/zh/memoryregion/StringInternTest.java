package com.zh.memoryregion;

/**
 * 测试string.intern()方法
 * jdk1.7
 * intern()调用的字符串首次出现时，在常量池中记录此字符串的引用
 * 此后相同字符串在调用intern()，由于不是首次出现，也就不是常量池中记录的那个字符串，因此第二个结果是false
 *
 * 第一个是true，因为字符串"计算机软件"是首次出现的字符串
 * 第二个是false，因为字符串"java"不是首次出现的字符串
 */
public class StringInternTest {

    public static void main(String[] args) {
        String str1 = new StringBuilder("计算机").append("软件").toString();
        System.out.println(str1.intern() == str1);

        String str2 = new StringBuilder("ja").append("va").toString();
        System.out.println(str2.intern() == str2);
    }
}
