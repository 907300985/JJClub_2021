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
    JPanel pan;
    JButton jb1, jb2, jb3;
    JTextArea jta = null;
    JScrollPane jscrollPane;

    public  Window(String s) {

        jf = new JFrame("啥也不是的 窗口");
        Container contentPane = jf.getContentPane();
        contentPane.setLayout(new BorderLayout());

        /*这一段代码可以自定义窗口图标*/
        Toolkit tk = Toolkit.getDefaultToolkit();
        java.awt.Image img = tk.getImage("src\\images\\jj3.png"); //获取图片  三种图片格式都可以
        jf.setIconImage(img);

        /*改变窗口的背景*/
        Icon bg = new ImageIcon("src\\images\\liuhua.png");
        JLabel jLabel = new JLabel(bg);
        jLabel.setBounds(0,0, 400,280 );
        jf.getLayeredPane().add(jLabel,new Integer(Integer.MIN_VALUE));
        //将图片添加到窗口
        pan = (JPanel) jf.getContentPane();
        pan.setOpaque(false);
        pan.setLayout(new FlowLayout());


        jta = new JTextArea(10, 15);
        jta.setText(s);

        jta.setTabSize(4);
        jta.setFont(new Font("标楷体", Font.BOLD, 16));

        jta.setLineWrap(true);// 激活自动换行功能
        jta.setWrapStyleWord(true);// 激活断行不断字功能
        //jta.setBackground(new Color(255, 255, 255, 255));
        jta.setOpaque(false);
        /*先将文本域设置为透明
        * 再将jscrollPane设置为透明
        * 然后getViewport设置为透明*/

        jscrollPane = new JScrollPane(jta);
        jscrollPane.setOpaque(false);
        jscrollPane.getViewport().setOpaque(false);

        pan = new JPanel();
        pan.setLayout(new GridLayout(1, 3));

        jb1 = new JButton("别按");
        jb2 = new JButton("都没");
        jb3 = new JButton("吊用");
        jb1.setBackground(new Color(245, 9, 9));
        pan.add(jb1);
        pan.add(jb2);
        pan.add(jb3);
        //contentPane.add(jLabel);

        contentPane.add(jscrollPane, BorderLayout.CENTER);
        contentPane.add(pan, BorderLayout.SOUTH);

        jf.setSize(400, 300);
        jf.setLocation(400, 200);
        jf.setVisible(true);
    }
}
