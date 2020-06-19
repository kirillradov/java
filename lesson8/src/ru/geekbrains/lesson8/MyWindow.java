package ru.geekbrains.lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyWindow extends JFrame {
    final int limit = 8;
    private String display = "";
    private double done;
    private boolean isDouble = false;
    private boolean isNegative = false;
    private String operation = "";
    private double num1;
    private double num2;
    private double num3;

    public MyWindow() {
        setTitle("Calculator");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300, 300, 400, 550);
        setLayout(null);
        JPanel textPanel = new JPanel(null);
        JTextField textField = new JTextField(null);
        textPanel.add(textField);
        textPanel.setLayout(new GridLayout(1,1));
        textField.setLayout(null);
        textField.setText(display);
        textPanel.setBounds(0,0,400,50);
        textField.setBounds(0,0,400,50);
        textField.setFont(new Font("Dialog", Font.PLAIN, 40));
        textField.setEditable(false);
        textField.setBackground(Color.white);
        textField.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if ( ((c < '0') || (c > '9') && (display.length() > limit))) {
                    e.consume();
                }
            }
        });
        JPanel numPanel = new JPanel(null);
        numPanel.setLayout(new GridLayout(4,4));
        numPanel.setBounds(0,50,385, 460);
        JButton[] jbs = new JButton[16];
        for(int i = 0; i < jbs.length; i++) {
            String text = "";
            if(i == 13) {text = "0";}
            if(i == 14) {text = ",";}
            if(i == 12) {text = "+/-";}
            if(i == 3) {text = "*";}
            if(i == 7) {text = "-";}
            if(i == 11) {text = "+";}
            if(i == 15) {text = "=";}
            if(i == 13) {text = "0";}
            if(i == 0) {text = "7";}
            if(i == 1) {text = "8";}
            if(i == 2) {text = "9";}
            if(i == 4) {text = "4";}
            if(i == 5) {text = "5";}
            if(i == 6) {text = "6";}
            if(i == 8) {text = "1";}
            if(i == 9) {text = "2";}
            if(i == 10) {text = "3";}

            jbs[i] = new JButton(text);
            jbs[i].setFocusable(false);
            jbs[i].setFont(new Font("Dialog", Font.PLAIN, 20));
            String finalText = text;
            jbs[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(finalText.equals("+/-")) {
                        if(!isNegative && !display.equals("")) {
                            done = Double.parseDouble(display);
                            done = -(done);
                            textField.setText(Double.toString(done));
                            isNegative = true;
                        } else if(isNegative) {
                            done = Double.parseDouble(display);
                            done = +(done);
                            textField.setText(Double.toString(done));
                            isNegative = false;

                        }

                    } else if (finalText.equals(",")) {
                        if(display.equals("")) {
                            display = "0.";
                        }
                        if(!isDouble) {
                            double disp = Double.parseDouble(display);
                            isDouble = true;
                            textField.setText(Double.toString(disp));
                        }

                    } else if (finalText.equals("+") && !display.equals("")) {
                        num1 = Double.parseDouble(display);
                        operation = "+";
                        display = "";

                    } else if (finalText.equals("-") && !display.equals("")) {
                        num1 = Double.parseDouble(display);
                        operation = "-";
                        display = "";
                    } else if (finalText.equals("*") && !display.equals("")) {
                        num1 = Double.parseDouble(display);
                        operation = "*";
                        display = "";

                    }
                    else if (finalText.equals("=") && !display.equals("")) {
                        num2 = Double.parseDouble(display);
                        if(operation.equals("+")) {
                            num3 = num1 + num2;
                            textField.setText(Double.toString(num3));
                            display = Double.toString(num3);
                            num2 = 0;
                            num3 = 0;
                            operation = "";
                        }
                        if (operation.equals("-")) {
                            num3 = num1 - num2;
                            textField.setText(Double.toString(num3));
                            display = Double.toString(num3);
                            num2 = 0;
                            num3 = 0;
                            operation = "";
                        }
                        if (operation.equals("*")) {
                            num3 = num1 * num2;
                                textField.setText(Double.toString(num3));
                                display = Double.toString(num3);
                                num2 = 0;
                                num3 = 0;
                            operation = "";
                        }
                    }
                        else {
                        if(display.length() <= limit && !finalText.equals("=") && !finalText.equals("-")
                                && !finalText.equals("*") && !finalText.equals("+")) {
                            display = display + finalText;
                            textField.setText(display);
                        }
                    }

                }
            });
            numPanel.add(jbs[i]);
        }

        JButton clearBtn = new JButton();
        clearBtn = new JButton("CLR");
        clearBtn.setLayout(new BorderLayout());
        clearBtn.setText("CLR");
        clearBtn.setBounds(315,5,60, 40);
        clearBtn.setFont(new Font("Dialog", Font.PLAIN, 20));
        clearBtn.setHorizontalAlignment(SwingConstants.CENTER);
        clearBtn.setMargin(new Insets(2,2,2,2));
        clearBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display = "";
                num1 = 0;
                num2 = 0;
                num3 = 0;
                operation = "";
                textField.setText(display);
            }
        });

        add(textPanel);
        add(numPanel);
        textField.add(clearBtn);
        setVisible(true);
        setResizable(false);
    }


}

