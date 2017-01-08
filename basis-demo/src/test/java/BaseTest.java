/**
 * Created by wangyunjing on 2016/12/27.
 */
public class BaseTest {

    public static void main(String[] args) {
        String addr = "辽宁省丹东市元宝区好哦搜了搜";
        String addr2 = "辽宁省丹东市元宝区";
        String newAddr = addr.substring(addr2.length());
        System.out.println(newAddr);
    }
}
