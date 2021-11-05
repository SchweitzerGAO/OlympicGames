package test.moduletest;

import com.team.olympics.adapter.AmericanAdapterGB;
import com.team.olympics.adapter.OlympicVillage;

//测试类
public class AdapterTest {
    public static void main(String[] args) {
        OlympicVillage hotel = new OlympicVillage();
        AmericanAdapterGB adapter = new AmericanAdapterGB();
        hotel.getElectricity(adapter, "手机充电器");
    }
}
