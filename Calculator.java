import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {
    private JPanel myPanel;
    private JTextField display;
    private JPanel KeysPanel;
    private JButton AcButton;
    private JButton backspaceButton;
    private JButton changesignButton;
    private JButton addButton;
    private JButton sevenButton;
    private JButton eightButton;
    private JButton nineButton;
    private JButton minusButton;
    private JButton fourButton;
    private JButton fiveButton;
    private JButton sixButton;
    private JButton MultiplyButton;
    private JButton oneButton;
    private JButton twoButton;
    private JButton threeButton;
    private JButton divideButton;
    private JButton doubleButton;
    private JButton zeroButton;
    private JButton dotbutton19;
    private JButton resultbutton;

    private String opA;
    private String opB;
    private String op;



    public Calculator() {
        AcButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(" ");
            }
        });
        oneButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText()+"1");
            }
        });
        twoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText()+"2");
            }
        });
        threeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText()+"3");
            }
        });
        fourButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText()+"4");
            }
        });
        fiveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText()+"5");
            }
        });
        sixButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText()+"6");
            }
        });

        sevenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText()+"7");
            }
        });
        eightButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText()+"8");
            }
        });
        nineButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText()+"9");
            }
        });
        doubleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText()+"00");
            }
        });
        zeroButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText()+"0");
            }
        });
        backspaceButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String disp=display.getText();
                if(!disp.isEmpty())
                    disp=disp.substring(0,disp.length()-1);

                display.setText(disp);
            }

        });
        changesignButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String disp=display.getText();
                if(!disp.isEmpty())
                {
                    if(disp.contains("."))
                    {
                        double DoubleDisp=Double.parseDouble(disp);
                        DoubleDisp=DoubleDisp*-1;
                        display.setText(Double.toString(DoubleDisp));
                    }
                    else
                    {
                        {
                            int  intDisp=Integer.parseInt(disp);
                            intDisp=intDisp*-1;
                            display.setText(Double.toString(intDisp));
                        }
                    }
                }
            }
        });
        dotbutton19.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String disp=display.getText();
                if(!disp.contains("."))
                {
                    disp=disp+".";
                    display.setText(disp);
                }
            }
        });
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String disp=display.getText();
                if(!disp.isEmpty())
                {
                    opA=disp;
                    op="+";
                    display.setText(" ");
                }
            }
        });
        minusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String disp=display.getText();
                if(!disp.isEmpty())
                {
                    opA=disp;
                    op="-";
                    display.setText(" ");
                }
            }
        });
        MultiplyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String disp=display.getText();
                if(!disp.isEmpty())
                {
                    opA=disp;
                    op="*";
                    display.setText(" ");
                }
            }
        });
        divideButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String disp=display.getText();
                if(!disp.isEmpty())
                {
                    opA=disp;
                    op="/";
                    display.setText(" ");
                }
            }
        });

        resultbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String disp=display.getText();
                if(!disp.isEmpty()&&!op.isEmpty())
                {
                    opB=disp;
                    double a=Double.parseDouble(opA);
                    double b=Double.parseDouble(opB);
                    String result ="";
                    if(op.equals("+"))
                    {
                         result=Double.toString(a+b);
                    } else if (op.equals("-")) {

                        result=Double.toString(a-b);
                    }
                    else if (op.equals("*")) {

                        result=Double.toString(a*b);
                    }
                    else if (op.equals("/")) {

                        result=Double.toString(a/b);
                    }
                    display.setText(result);
                }

            }
        });
    }

    public  JPanel getRoot()
    {
        return  myPanel;
    }
    public static void main(String[] args) {
        JFrame frame=new JFrame("calculator");
        frame.setContentPane((new Calculator()).getRoot() );
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
   frame.setVisible(true);

    }
}
