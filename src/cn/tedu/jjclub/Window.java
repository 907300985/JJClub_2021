package cn.tedu.jjclub;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @Date:2021/10/28 18:15
 * @Author:NANDI_GUO
 */


public class Window{
    JFrame jf;
    JPanel jpanel;
    JButton jb1, jb2, jb3;
    JTextArea jta = null;
    JScrollPane jscrollPane;

    public  Window(String s) {

        jf = new JFrame("啥也不是的 窗口");
        Container contentPane = jf.getContentPane();
        //contentPane.setLayout(new BorderLayout());

        Toolkit tk = Toolkit.getDefaultToolkit();
        //获取图片  三种图片格式都可以
        java.awt.Image img = tk.getImage("src\\rimu.jpg");
        // 给窗体设置图
        jf.setIconImage(img);

        /*改变窗口背景*/
        Icon im = new ImageIcon("src\\rimu.jpg");
        //将图片添加到JLable标签
        JLabel jLabel = new JLabel(im);
        //设置标签的大小
        jLabel.setBounds(0,0, 400,300 );
        //将图片添加到窗口
        //jf.add(jLabel);



        jta = new JTextArea(10, 15);
        jta.setText(s);
        jta.setTabSize(4);
        jta.setFont(new Font("标楷体", Font.BOLD, 16));
        jta.setLineWrap(true);// 激活自动换行功能
        jta.setWrapStyleWord(true);// 激活断行不断字功能
        jta.setBackground(new Color(82, 119, 204));
        //jta.add(jLabel);

        jscrollPane = new JScrollPane(jta);
        jpanel = new JPanel();
        jpanel.setLayout(new GridLayout(1, 3));

        jb1 = new JButton("别按");
        jb2 = new JButton("都没");
        jb3 = new JButton("吊用");
        jb1.setBackground(new Color(245, 9, 9));
        jpanel.add(jb1);
        jpanel.add(jb2);
        jpanel.add(jb3);


        contentPane.add(jscrollPane, BorderLayout.CENTER);
        contentPane.add(jpanel, BorderLayout.SOUTH);

        jf.setSize(400, 300);
        jf.setLocation(400, 200);
        jf.setVisible(true);

    }

}
