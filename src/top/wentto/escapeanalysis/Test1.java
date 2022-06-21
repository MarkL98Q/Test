package top.wentto.escapeanalysis;

/**
 * • @Author: muli
 * • @Date: 2022/6/21 10:54 上午
 * • @Description:
 * -XX:+PrintGC -Xms5M -Xmn5M -XX:+DoEscapeAnalysis
 */
public class Test1 {

    public static void main(String[] args) {
        for (int i = 0; i < 500_000_000; i++) {
            createObject();
        }
    }

    private static void createObject() {
        new Object();
    }
}
