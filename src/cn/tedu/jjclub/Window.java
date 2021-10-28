package cn.tedu.jjclub;

import org.junit.Test;

import javax.swing.*;
import java.awt.*;

/**
 * @Date:2021/10/28 18:15
 * @Author:NANDI_GUO
 */


public class Window extends JFrame {
    @Test
    public void initWindow(){
        this.setTitle("啥也不是的窗口");
        this.setSize(500,500);
        this.setLocation(200,200);
        this.setVisible(true);

        this.setLayout(new BorderLayout());
        JButton button1 = new JButton("点了没卵用的按钮");
        button1.setBackground(Color.CYAN);
        button1.setPreferredSize(new Dimension(40, 40));
        this.add(button1,BorderLayout.SOUTH);

        JPanel Basic_panel=new JPanel();

    }
}
