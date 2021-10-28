package cn.tedu.jjclub;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

/**
 * @Date:2021/10/28 14:11
 * @Author:NANDI_GUO
 */
public class TestSyc {
    public static void main(String[] args) {

        Date d = new Date();
        System.out.println("北京时间 ： "+d);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日   HH:mm:ss");
        String s = sdf.format(d);
        Long l=18838883300L;
        String xiaoming = "小明随时Call：";
        String s1 = "北京时间："+ s +"\n"+ xiaoming + l;
        Window w = new Window(s1);
        System.out.println("兄弟们，输入0-6随便一个整数：");
        int a = new Scanner(System.in).nextInt();
        TrueMan man = new TrueMan();
        System.out.println(man.op(a));

        for (int i = 0; i < 10 ; i++) {
            System.out.println(man.op(a)+"吃啥都行");
        }
    }
}
