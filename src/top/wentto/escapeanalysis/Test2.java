package top.wentto.escapeanalysis;

/**
 * • @Author: muli
 * • @Date: 2022/6/21 10:54 上午
 * • @Description:
 * -XX:+DoEscapeAnalysis -XX:+EliminateLocks
 */
public class Test2 {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 500_000_000; i++) {
            createObject();
        }
        System.out.println(System.currentTimeMillis() - start);
    }

    private static void createObject() {
        synchronized (new Object()){

        }
    }
}
