package test.moduletest;

import com.team.olympics.proxy.TelevisionRelay;

public class ProxyTest {
    public static void main(String[] args) {
        //创建电视台对象CCTV5
        TelevisionRelay CCTV5 = new TelevisionRelay();
        CCTV5.BroadcastLive();
    }
}
