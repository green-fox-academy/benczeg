public class AppendAFunc {
    public static String appendAFunc(String a) {
        String appender = (a + "a");
        return appender;
    }

    public static void main(String[] args) {
        String typo = "Chinchill";
        System.out.println(appendAFunc(typo));
    }
}

