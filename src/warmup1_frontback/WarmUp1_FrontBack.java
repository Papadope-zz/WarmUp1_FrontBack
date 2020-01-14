package warmup1_frontback;

public class WarmUp1_FrontBack {

    public static void main(String[] args) {
        System.out.println(frontBack("code"));
        System.out.println(frontBack("a"));
        System.out.println(frontBack("ba"));
    }

    public static String frontBack(String str) {
        if (str.length() == 1 || str.length() == 0) {
            return str;
        } else {
            return str = (str.substring(str.length() - 1, str.length())
                    + str.substring(1, str.length() - 1) + str.substring(0, 1));
        }
    }
}
