package form_dang_nhap;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author HP
 */
public class Calculator extends JFrame{
    private JLabel jlb1,jlb2,jlb3;
    private JTextField jtf1,jtf2,jtf3;
    private JButton jbclear,jbcong,jbtru,jbnhan,jbchia;
    public Calculator(){
        init();
    }
    public void init(){
        jlb1=new JLabel("first number");
        jlb2=new JLabel("second number");
        jlb3=new JLabel("result");
        jtf1=new JTextField("");
        jtf2=new JTextField("");
        jtf3=new JTextField("");
        jbclear=new JButton("Clear");
        jbcong=new JButton("cộng");
        jbtru=new JButton("trừ");
        jbnhan=new JButton("nhân");
        jbchia=new JButton("Chia");
        
        jlb1.setBounds(50, 100, 200  , 20);
        jlb2.setBounds(50, 130, 200, 20);
        jlb3.setBounds(50, 160, 200, 20);
        jtf1.setBounds(150  , 100, 100, 20);
        jtf2.setBounds(150 , 130, 100, 20);
        jtf3.setBounds(150  , 160, 100, 20);
        jbclear.setBounds(100, 200, 70, 30);
        jbcong.setBounds(50 , 250, 70, 30);
        jbtru.setBounds(150, 250, 70, 30);
        jbnhan.setBounds(250, 250, 70, 30);
        jbchia.setBounds(350, 250, 70, 30);
        
        add(jlb1);add(jlb2);add(jlb3);
        add(jtf1);add(jtf2);add(jtf3);
        add(jbclear);add(jbcong);add(jbtru);add(jbtru);add(jbnhan);add(jbchia);
        
        jbcong.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
              int num1=Integer.parseInt(jtf1.getText());
              int num2=Integer.parseInt(jtf2.getText());
              jtf3.setText(num1+num2+"");
            }
        
        });
        jbtru.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                int num1=Integer.parseInt(jtf1.getText());
                int num2=Integer.parseInt(jtf2.getText());
                jtf3.setText(num1-num2+"");
            }
        });
        jbnhan.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                int num1=Integer.parseInt(jtf1.getText());
                int num2=Integer.parseInt(jtf2.getText());
                jtf3.setText(num1*num2+"");
            }
        });
        jbchia.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num1=Integer.parseInt(jtf1.getText());
                int num2=Integer.parseInt(jtf2.getText());
                jtf3.setText(num1/num2+"   ");
            }
        });
        jbclear.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
            
                jtf1.setText("");
                jtf2.setText("");
                jtf3.setText("");
            }
        });
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Calculator();
    }
}

