public class Main {
    public static void main(String[] args) {
        String s = "人易科技:上 機 測 驗 - 演算法";
        s = s.replace(":", "：");
        while (!s.replaceAll("([^\\-]) ([^\\-])", "$1$2").equals(s)) {
            s = s.replaceAll("([^\\-]) ([^\\-])", "$1$2");
        }
        int begin = s.indexOf("：") + 1;
        int end = s.indexOf("-");
        System.out.println(s.substring(begin, end));
    }
}
