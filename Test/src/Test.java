import java.util.Locale;



public class Test {
    public static final String STRING_CODE_SHIFT_JIS = "Shift_JIS";
    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ
        String tmp="abc";
        String tmp1 = tmp.toLowerCase();
        String tmp2 = tmp.toLowerCase(Locale.ENGLISH);
            System.out.println(tmp1);

            System.out.println(tmp2);
    }

}
